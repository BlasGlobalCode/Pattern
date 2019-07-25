package de.lotto_rlp.aufgabeZwei;

public class QuadratSechs {

	public static void main(String[] args) {
		int x = 1;
		int a =5;
		
		
//        for (int i = 0; i < 4; i++) {
//        	
//        	for (int j = 4; j > 4 ; j--) {
//        		
//        		System.out.print(" ");
//                
//            	}
//            	
//        		for (int k = 0; k < x; k++) {
//         
//        			System.out.print("X");
//        		}
//        		
//        		System.out.println("");
//        }
        

//		
        int b = 4;
        int counter_stars =1;
        for (int zeile = 1; zeile <= b; zeile++) {
            for (int leerzeichen = 1; leerzeichen <= b - zeile; leerzeichen++) {
                System.out.print(" ");
            }
            for (int sterne = 1; sterne <= counter_stars; sterne++) {
                System.out.print("X");
            }
            counter_stars=counter_stars+2;
            System.out.println("");
        }
	
		
		
		
	}
}
