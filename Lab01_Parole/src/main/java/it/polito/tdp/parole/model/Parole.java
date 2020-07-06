package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.List;

public class Parole {
	
	List<String> parole ;
		
	public Parole() {
		this.parole = new ArrayList<>();
	}
	
	public void addParola(String p) {
		this.parole.add(p);
	}
	
	public List<String> getElenco() {
		List<String> ordinata = new  ArrayList<>(parole);
		ordinata.sort(new OrdineAlfabetico());
		return ordinata;
	}
	
	public void reset() {
		this.parole.clear();
	}

	@Override
	public String toString() {
		return "" + parole + "";
	}
	

	
}
