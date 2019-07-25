package de.lotto_rlp.aufgabeZwei;

public class QuadratSieben {

	public static void main(String[] args) {
		int b = 50;
		int leerzeichen;
        int counter_stars = 1;
        int sterne = 2 ;
        for (int zeile = 1; zeile <= b; zeile++) {
            for ( leerzeichen = 1; leerzeichen <= b - zeile; leerzeichen++) {
                System.out.print(" ");
            }
            for (sterne = 1; sterne <= counter_stars; sterne++) {
            	
            	System.out.print("X");
            }
            counter_stars += 2;
            System.out.println();
        }
             for(int i = 1; i <= 3; i++) { 
            	
            	 for(leerzeichen = 1 ; leerzeichen <= b % counter_stars - 1 ; leerzeichen++) {
            		 System.out.print(" ");
            	 }
            	 System.out.print("X");
            	 System.out.println();
            	
             }
            
	}

}