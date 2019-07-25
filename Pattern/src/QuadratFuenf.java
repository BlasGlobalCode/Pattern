package de.lotto_rlp.aufgabeZwei;

public class QuadratFuenf {

	public static void main(String[] args) {
				
		for(int i = 0; i <= 4; i++) {
	
			for(int k = 1; k <= i ; k++) {
				System.out.print(" ");
			}
				for(int j = 4 - 1 ; j >= i ; j--) {
					
					System.out.print("X");
					
				}
				System.out.println("");	
			}
			
		}		
	}
