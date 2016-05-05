package menjacnica.gui;

import java.awt.EventQueue;
import java.io.File;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import menjacnica.Menjacnica;
import menjacnica.Kurs;

public class KontrolerGUI {
	
	private static MenjacnicaGUI prozor;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	
	}


