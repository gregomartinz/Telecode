package package1;

import java.util.Scanner;

public class Transmision {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] mensaje = new String[100];
		String[] resultado = new String[100];
		String aux = in.nextLine();
		String aux2 = aux;
		
		
		for (int i = 0; i < aux.length(); i++) {
			if (aux.substring(0, i).matches(aux.substring(i,aux.length()))) {
				aux2 = aux.substring(i, aux.length());
			}
		}
		System.out.println(aux2);
		
	}

}
