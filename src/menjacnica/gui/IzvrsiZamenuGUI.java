package menjacnica.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;

public class IzvrsiZamenuGUI extends JFrame {
	private JLabel lblKupovniKurs;
	private JLabel lblProdajniKurs;
	private JTextField textKupovni;
	private JTextField textProdajni;
	private JComboBox comboBox;
	private JLabel lblIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupujem;
	private JRadioButton rdbtnProdajme;
	private JTextField textIznos;
	private JSlider slider;
	private JButton btnZamena;
	private JButton btnOdustani;
	public IzvrsiZamenuGUI() {
		setTitle("Izvrsi zamenu");
		getContentPane().setLayout(null);
		getContentPane().add(getLblKupovniKurs());
		getContentPane().add(getLblProdajniKurs());
		getContentPane().add(getTextKupovni());
		getContentPane().add(getTextProdajni());
		getContentPane().add(getComboBox());
		getContentPane().add(getLblIznos());
		getContentPane().add(getLblVrstaTransakcije());
		getContentPane().add(getRdbtnKupujem());
		getContentPane().add(getRdbtnProdajme());
		getContentPane().add(getTextIznos());
		getContentPane().add(getSlider());
		getContentPane().add(getBtnZamena());
		getContentPane().add(getBtnOdustani());
		setBounds(100, 100, 450, 300);
		setResizable(false);
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(28, 29, 94, 21);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(265, 32, 88, 18);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextKupovni() {
		if (textKupovni == null) {
			textKupovni = new JTextField();
			textKupovni.setEditable(false);
			textKupovni.setBounds(28, 61, 86, 20);
			textKupovni.setColumns(10);
		}
		return textKupovni;
	}
	private JTextField getTextProdajni() {
		if (textProdajni == null) {
			textProdajni = new JTextField();
			textProdajni.setEditable(false);
			textProdajni.setBounds(265, 61, 86, 20);
			textProdajni.setColumns(10);
		}
		return textProdajni;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(163, 79, 57, 20);
			comboBox.addItem("EUR");
			comboBox.addItem("USD");
			comboBox.addItem("CHF");
			
		}
		return comboBox;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(28, 115, 69, 14);
		}
		return lblIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(265, 92, 135, 21);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupujem() {
		if (rdbtnKupujem == null) {
			rdbtnKupujem = new JRadioButton("Kupovina");
			rdbtnKupujem.setBounds(254, 111, 109, 23);
		}
		return rdbtnKupujem;
	}
	private JRadioButton getRdbtnProdajme() {
		if (rdbtnProdajme == null) {
			rdbtnProdajme = new JRadioButton("Prodaja");
			rdbtnProdajme.setBounds(254, 137, 109, 23);
		}
		return rdbtnProdajme;
	}
	private JTextField getTextIznos() {
		if (textIznos == null) {
			textIznos = new JTextField();
			textIznos.setBounds(28, 150, 86, 20);
			textIznos.setColumns(10);
		}
		return textIznos;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setBounds(93, 181, 200, 35);
		}
		return slider;
	}
	private JButton getBtnZamena() {
		if (btnZamena == null) {
			btnZamena = new JButton("Izvrsi zamenu");
			btnZamena.setBounds(28, 228, 126, 23);
		}
		return btnZamena;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.setBounds(264, 228, 89, 23);
		}
		return btnOdustani;
	}
}
