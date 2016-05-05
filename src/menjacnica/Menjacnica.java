package menjacnica;

import java.util.LinkedList;
import java.util.List;

public class Menjacnica {
	
private List<Kurs> kursevi;
	
	public Menjacnica() {
		kursevi = new LinkedList<>();
	}
	
	public void dodajKurs(Kurs k){
		if(k == null)
			return;
		
		kursevi.add(k);
	}
	
	public void izbrisiKurs(int pozicija){
		if(pozicija < 0)
			return;
		
		kursevi.remove(pozicija);
	}

	public List<Kurs> getKursevi() {
		return kursevi;
	}

	public void setKursevi(List<Kurs> kursevi) {
		this.kursevi = kursevi;
	}

}
