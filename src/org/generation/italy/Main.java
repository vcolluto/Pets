/*
 * Nel metodo main, viene creata un'hashmap di oggetti che contiene generici animali domestici, cani e gatti, usando il nome come chiave.
Vengono quindi visualizzati i dati comuni di ogni animale, e vengono chiamati i metodi comuni.

Viene quindi chiesto il nome di un animale, 
e se esiste nell'hashmap un animale con quel nome 
vengono visualizzati tutti gli attributi dell'animale 
(compresi quelli specifici) 
e vengono chiamati tutti i metodi (compresi quelli specifici)
 * 
 */

package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

import org.generation.italy.model.AnimaleDomestico;
import org.generation.italy.model.Cane;
import org.generation.italy.model.Gatto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String risposta;
		HashMap<String, AnimaleDomestico> elencoAnimali = new HashMap<String, AnimaleDomestico>();

		elencoAnimali.put("Peppe", new Gatto("siamese", "Peppe", false));
		elencoAnimali.put("peppino", new Cane("bernese", "peppino", true));
		elencoAnimali.put("fuffi", new Cane("san bernardo", "fuffi", false));
		elencoAnimali.put("nemo", new AnimaleDomestico("rombo", "nemo"));

		AnimaleDomestico A1 = new AnimaleDomestico("Beagle", "Paoletto");
		Cane C1 = new Cane("Meticcio", "Ettore", false);
		Gatto G1 = new Gatto("Persiano", "Cipollo", true);

		elencoAnimali.put(A1.getNome(), A1);
		elencoAnimali.put(C1.getNome(), C1);
		elencoAnimali.put(G1.getNome(), G1);

		for (String i : elencoAnimali.keySet()) {
			System.out.println(elencoAnimali.get(i).toString());

			System.out.println(elencoAnimali.get(i).faiVerso());
			System.out.println(elencoAnimali.get(i).mangia());
			System.out.println();

		}

		System.out.println("inserisci il nome dell'animale");
		risposta = sc.nextLine();
		if (elencoAnimali.containsKey(risposta)) {
			AnimaleDomestico A = elencoAnimali.get(risposta);
			System.out.println(A.toString()); // dati generici
			if (A instanceof Cane) // A è un cane
				if (((Cane) A).isMuseruolaObbligatoria())
					System.out.println("Museruola obbligatoria");
				else
					System.out.println("Museruola non obbligatoria");
			

			else if (A instanceof Gatto)
				if (((Gatto) A).isEteroCromiaOcchi())
					System.out.println("Occhi di colore diverso");
				else
					System.out.println("Occhi di colore uguale");

			System.out.println(A.faiVerso());
			System.out.println(A.mangia());

		}

	}

}
