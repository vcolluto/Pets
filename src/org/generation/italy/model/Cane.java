package org.generation.italy.model;

public class Cane extends AnimaleDomestico {
	boolean museruolaObbligatoria;

	public Cane(String razza, String nome,boolean museruolaObbligatoria) { 
		super(razza, nome);
		this.museruolaObbligatoria = museruolaObbligatoria;
	}

@Override
public String faiVerso(){
    return "Bau Bau!!";
}

//Override: "cambia" in base a chi lo chiama (il modo è lo stesso, cambia la classe)
@Override 
public String mangia(){
    return "Mangio crocchette con carne di manzo";
}

@Override
public String toString() {		//sovrascrivo (Override) il toString() di Object
	return "Cane [razza= " + razza + ", nome= " + nome + ", museruola= " + museruolaObbligatoria +"]";
}

public boolean isMuseruolaObbligatoria() {
	return museruolaObbligatoria;
}

}
