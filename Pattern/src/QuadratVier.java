package de.lotto_rlp.aufgabeZwei;

public class QuadratVier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 4;
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= b - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("X");
            }
            System.out.println("");
        }

		
	}		
}