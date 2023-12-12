package org.generation.italy;

import org.generation.italy.model.AnimaleDomestico;
import org.generation.italy.model.Cane;
import org.generation.italy.model.Gatto;

public class Main {

	public static void main(String[] args) {
		AnimaleDomestico A1 = new AnimaleDomestico( "Beagle", "Paoletto"); 
		System.out.println(A1.toString());
		System.out.println(A1.faiVerso());
		System.out.println(A1.mangia());
		System.out.println(A1.mangia("Pasta"));

		
		System.out.println("\n");
		Cane C1 = new Cane ("Meticcio","Ettore",false);
		System.out.println(C1.toString());		//generico
		System.out.println(C1.faiVerso());
		System.out.println(C1.mangia());	//di cane
		System.out.println(C1.mangia("Pasta"));  //generico
		
		System.out.println("\n");
  		Gatto G1 = new Gatto ("Persiano", "Cipollo",true);
  		System.out.println(G1.toString());		//generico
		System.out.println(G1.faiVerso());
		System.out.println(G1.mangia());	//di cane
		System.out.println(G1.mangia("Pasta"));  //generico




	}


}
