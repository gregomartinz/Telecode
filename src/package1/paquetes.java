package package1;

import java.util.Scanner;

public class paquetes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 1000; i++) {
			String aux = in.nextLine();
			if (aux == null) {
				break;
			}
			if (aux.length()*8 >240) {
				System.out.println("NO");
			}else {
				System.out.println("SI");
			}
		}
	}

}
