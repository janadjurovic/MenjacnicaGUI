package menjacnica.gui;

import java.util.LinkedList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import menjacnica.Kurs;

public class MenjacnicaModel extends AbstractTableModel {
	
	private final String[] kolone = new String[] { "Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv" };
	private List<Kurs> kursevi;
	
	public MenjacnicaModel(List<Kurs> kursevi) {
		if(kursevi == null){
			this.kursevi = new LinkedList<>();
		} else {
			this.kursevi = kursevi;
		}
	}
	@Override
	public int getColumnCount() {
		return kolone.length;
	}

	@Override
	public int getRowCount() {
		return kursevi.size();
	}

	@Override
	public Object getValueAt(int red, int kolona) {
		Kurs k = kursevi.get(red);
		switch (kolona){
		case 0: return k.getSifra();
		case 1: return k.getSkraceniNaziv();
		case 2: return k.getProdajniKurs();
		case 3: return k.getSrednjiKurs();
		case 4: return k.getKupovniKurs();
		case 5: return k.getNaziv();
		default: return null;
		}
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	
	@Override
	public String getColumnName(int column) {
		return kolone[column];
	}
	
	public void ucitajKurs(List<Kurs> kursevi){
		this.kursevi = kursevi;
		fireTableDataChanged();
	}

	public Kurs getKursByIndex(int index){
		return kursevi.get(index);
	}
}
