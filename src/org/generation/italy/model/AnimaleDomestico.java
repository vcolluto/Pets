package org.generation.italy.model;

public class AnimaleDomestico {
protected String razza, nome;


public AnimaleDomestico(String razza, String nome) {
	super();
	this.razza = razza;
	this.nome = nome;
}

public String faiVerso(){
    return "emetto un verso";
}

public String mangia(){
    return "mangio del cibo";
}

//Overload: "cambia" in base a come lo chiamo
public String mangia(String cibo){ //sovraccarico (overload) il metodo mangia
    return "mangio " + cibo;
}

public String mangia(String cibo, int grammi){ //sovraccarico (overload) il metodo mangia
    return "mangio " +grammi +" gr di "+ cibo;
}

@Override
public String toString() {		//sovrascrivo (Override) il toString() di Object
	return "AnimaleDomestico [razza=" + razza + ", nome=" + nome + "]";
}

public String getRazza(){
     return razza;
}

public String getNome(){
    return nome;
}





}
