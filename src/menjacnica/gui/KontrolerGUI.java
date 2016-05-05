package menjacnica.gui;

import java.awt.EventQueue;
import java.io.File;
import java.util.List;

import javax.print.attribute.TextSyntax;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import menjacnica.Menjacnica;
import menjacnica.Kurs;

public class KontrolerGUI {
	
	private static MenjacnicaGUI prozor;
	private static Menjacnica menjacnica;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menjacnica = new Menjacnica();
					prozor = new MenjacnicaGUI();
					prozor.setVisible(true);
					prozor.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void ucitajIzFajla() {
		JFileChooser jfc = new JFileChooser();
		jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
		int povratnaVrednost = jfc.showOpenDialog(prozor.getContentPane());
		
		if(povratnaVrednost == JFileChooser.APPROVE_OPTION){
			String putanja = " Ucitan fajl: "+jfc.getSelectedFile().getAbsolutePath();
			prozor.dodajStatus(putanja);
		}
		
	}

	public static void sacuvajUFajl() {
		JFileChooser jfc = new JFileChooser();
		jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
		int povratnaVrednost = jfc.showSaveDialog(prozor.getContentPane());
		
		if(povratnaVrednost == JFileChooser.APPROVE_OPTION){
			String putanja =  "Sacuvan fajl: "+ jfc.getSelectedFile().getAbsolutePath();
			prozor.dodajStatus(putanja);
		}
		
	}

	
	public static void izadji() {
		int povratnaVrednost = JOptionPane.showConfirmDialog(prozor.getContentPane(),
				"Da li zelite da izadjete iz programa?", "Izlazak", JOptionPane.YES_NO_CANCEL_OPTION);

		if (povratnaVrednost == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		
	}

	public static void prikaziPodatke() {
		JOptionPane jop = new JOptionPane();
		jop.showMessageDialog(prozor, "Ime i prezime: Jana Djurovic \n Datum rodjenja: 07.04.1996", "Informacije", 1);
		
	}
	
	public static void unesiKurs(String naziv, String sifra, double prodajni, double kupovni, double srednji, String skraceniNaziv ){
			String txt = naziv +"\t" + sifra +"\t"+ prodajni +"\t"+ kupovni+"\t" + srednji  +"\t"+skraceniNaziv;
			prozor.dodajText(txt);
			Kurs k = new Kurs();
			k.setSifra(sifra);
			k.setNaziv(naziv);
			k.setSkraceniNaziv(skraceniNaziv);
			k.setKupovniKurs(kupovni);
			k.setSrednjiKurs(srednji);
			k.setProdajniKurs(prodajni);
			menjacnica.dodajKurs(k);
			prozor.osvezi();
		
		
	}
	
	public static void prikaziProzorDodajKurs(){
		DodajKursGUI prozor = new DodajKursGUI();
		prozor.setVisible(true);
		prozor.setLocationRelativeTo(null);
	}
	
	public static List<Kurs> vratiSve(){
		return menjacnica.getKursevi();
	}

	public static void izbrisi() {
		try {
			int pozicija = prozor.vratiSelektovanRed();
			
			if(pozicija == -1){
				JOptionPane.showMessageDialog(prozor, "Izaberite red koji zelite da izbrisete", "Greska", JOptionPane.ERROR_MESSAGE);
				return;
			}
			int povratnaVrednost = JOptionPane.showConfirmDialog(prozor, "Da li ste sigurni da zelite da izbrisete selektovani red?", "Upozorenje",JOptionPane.YES_NO_OPTION);
			
			if(povratnaVrednost == JOptionPane.YES_OPTION){
				izbrisiKursIzMenjacnice(pozicija);
				prozor.osvezi();
				prozor.upisiUStatus("Izbrisan je red sa indeksom: " + pozicija + "!");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(prozor, "Doslo je do greske prilikom brisanja!" + e.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
	
	public static void izbrisiKursIzMenjacnice(int pozicija){
		menjacnica.izbrisiKurs(pozicija);
	}
	}


