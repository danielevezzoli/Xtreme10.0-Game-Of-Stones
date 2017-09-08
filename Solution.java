package it.unibs.ing.ieee.xtreme.gameofstones;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println();
		Scanner s = new Scanner(System.in);
		int ciclo = Integer.parseInt(s.nextLine());

		
		for(int i = 0; i< ciclo; i++) {
			int gioco = Integer.parseInt(s.nextLine());

			//true vince 1° giocatore
			boolean partite[] = new boolean[gioco];
			Arrays.fill(partite, true);
			
			for(int j = 0; j<gioco; j++) {
				int nPile = Integer.parseInt(s.nextLine());
				String[] pile = s.nextLine().trim().split("\\W+");
				
				int dispari=0;
				for(int k =0; k < nPile; k++) {
					if(isDispari(pile[k]))
						dispari++;
					
				}
				if(dispari % 2 == 0)
					partite[j] = false;
			}
			int n=0;
			for(int j=0; j<partite.length; j++) {
				if(partite[j])
					n++;
			}
			if(n%2==0)
				System.out.println("Bob");
			else
				System.out.println("Alice");
		}
		
	}

	private static boolean isDispari(String string) {
		int pila = Integer.parseInt(string);
		pila -= 1;
		if(pila % 4 == 0)
			return false;
		else
			return true;
	}
}
