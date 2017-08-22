package package1;

import java.util.Locale;
import java.util.Scanner;

public class Espacio {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[][] lista = new String[30][30];
		for (int i = 0; i < 29; i++) {	
			String s = in.nextLine();
			lista[i] = s.split("");
		}
		for (int i = 0; i < 29; i++) {
			for (int j = 0; j < 29; j++) {
				if (lista[i][j].equals("E")) {
					
					System.out.println(i+j-1);
				}
			}
			
		}
System.out.println();
	}

}
