package org.generation.italy.model;

public class Gatto extends AnimaleDomestico {
 	protected boolean eteroCromiaOcchi;
 
	public Gatto(String razza, String nome, boolean eteroCromiaOcchi ) {
		super(razza, nome);
		this.eteroCromiaOcchi = eteroCromiaOcchi;
	}
	
	public String faiFusa(){
		return "prprprprprpr";		
	}
	
	@Override
	public String faiVerso(){
		return "Miao Miao";
	}

	@Override
	public String mangia(){
		return "Mangio crocchette al pesce";
	}

	@Override
	public String toString() {		//sovrascrivo (Override) il toString() di Object
	return "Gatto [razza= " + razza + ", nome= " + nome + ", eteroCromiaOcchi= " + eteroCromiaOcchi +"]";
	}
