package menjacnica.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.security.auth.callback.TextOutputCallback;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {
	private JPanel panel;
	private JLabel lblSifra;
	private JTextField textSifra;
	private JLabel lblNaziv;
	private JTextField textNaziv;
	private JLabel lblProdajni;
	private JTextField textProdajni;
	private JLabel lblSrednjikurs;
	private JTextField textSrednji;
	private JLabel lblKupovni;
	private JTextField textKupovni;
	private JLabel lblSkraceniNaziv;
	private JTextField textSkraceni;
	private JButton btnDodaj;
	private JButton btnOdustani;
	public DodajKursGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}

		});
		setTitle("Dodaj kurs");
		getContentPane().add(getPanel(), BorderLayout.CENTER);
		setBounds(100, 100, 450, 300);
		setResizable(false);
	}
	
	

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblSifra());
			panel.add(getTextSifra());
			panel.add(getLblNaziv());
			panel.add(getTextNaziv());
			panel.add(getLblProdajni());
			panel.add(getTextProdajni());
			panel.add(getLblSrednjikurs());
			panel.add(getTextSrednji());
			panel.add(getLblKupovni());
			panel.add(getTextKupovni());
			panel.add(getLblSkraceniNaziv());
			panel.add(getTextSkraceni());
			panel.add(getBtnDodaj());
			panel.add(getBtnOdustani());
		}
		return panel;
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(22, 25, 73, 14);
		}
		return lblSifra;
	}
	private JTextField getTextSifra() {
		if (textSifra == null) {
			textSifra = new JTextField();
			textSifra.setBounds(103, 22, 86, 20);
			textSifra.setColumns(10);
		}
		return textSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(212, 25, 56, 14);
		}
		return lblNaziv;
	}
	private JTextField getTextNaziv() {
		if (textNaziv == null) {
			textNaziv = new JTextField();
			textNaziv.setBounds(310, 22, 86, 20);
			textNaziv.setColumns(10);
		}
		return textNaziv;
	}
	private JLabel getLblProdajni() {
		if (lblProdajni == null) {
			lblProdajni = new JLabel("Prodajni kurs");
			lblProdajni.setBounds(10, 78, 85, 14);
		}
		return lblProdajni;
	}
	private JTextField getTextProdajni() {
		if (textProdajni == null) {
			textProdajni = new JTextField();
			textProdajni.setBounds(103, 75, 86, 20);
			textProdajni.setColumns(10);
		}
		return textProdajni;
	}
	private JLabel getLblSrednjikurs() {
		if (lblSrednjikurs == null) {
			lblSrednjikurs = new JLabel("Srednji kurs");
			lblSrednjikurs.setBounds(212, 78, 88, 14);
		}
		return lblSrednjikurs;
	}
	private JTextField getTextSrednji() {
		if (textSrednji == null) {
			textSrednji = new JTextField();
			textSrednji.setBounds(310, 75, 86, 20);
			textSrednji.setColumns(10);
		}
		return textSrednji;
	}
	private JLabel getLblKupovni() {
		if (lblKupovni == null) {
			lblKupovni = new JLabel("Kupovni kurs");
			lblKupovni.setBounds(10, 128, 85, 14);
		}
		return lblKupovni;
	}
	private JTextField getTextKupovni() {
		if (textKupovni == null) {
			textKupovni = new JTextField();
			textKupovni.setBounds(103, 125, 86, 20);
			textKupovni.setColumns(10);
		}
		return textKupovni;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(212, 128, 88, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextSkraceni() {
		if (textSkraceni == null) {
			textSkraceni = new JTextField();
			textSkraceni.setBounds(310, 125, 86, 20);
			textSkraceni.setColumns(10);
		}
		return textSkraceni;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj ");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					KontrolerGUI.unesiKurs(textNaziv.getText(), textSifra.getText(), Double.parseDouble(textProdajni.getText()) ,
							Double.parseDouble(textKupovni.getText()), Double.parseDouble(textSrednji.getText()), textSkraceni.getText());
					dispose();
				}
			});
			btnDodaj.setBounds(70, 207, 89, 23);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(263, 207, 89, 23);
		}
		return btnOdustani;
	}
}
