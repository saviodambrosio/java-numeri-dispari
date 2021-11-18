package org.generation.italy.cicli;

//import

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		
//chiedo all'utente il numero di elementi da visualizzare
		System.out.println("Stabilisci il numero di elementi da prendere in considerazione :");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		Random random = new Random();
		for (int i=0; i<n; i++) {
			array[i]= random.nextInt(100); 
			
			if (array[i] % 2 != 0) {
				System.out.println(array[i]);
			}
		}
	
	
	

	
	
	

	
	
	
	
	
	
	
	
	
	}

}
