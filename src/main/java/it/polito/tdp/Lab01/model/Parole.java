package it.polito.tdp.Lab01.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parole implements Comparable <Parole>{
	private List <String> listaParole = new ArrayList<String>();
	
	public Parole() {
	}

	public void addParola(String p) {
		listaParole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(listaParole);
		return listaParole;
	}
	
	public void reset() {
		listaParole.clear();
	}

	@Override
	public int compareTo(Parole p) {
		return this.compareTo(p);
	}

	/*@Override
	public String toString() {
		return listaParole + "\n";
	}*/
	
}