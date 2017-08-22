package package1;

import java.util.Scanner;

public class Conjetura {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n = in.nextDouble();
		int iteraciones = 0;
		boolean mal = false;
		boolean dentro = true;
		double [] serie = new double[3];
		while (dentro) {
			if (n%2 == 0) {
				n = n/2;
				iteraciones++;
			}else {
				n = 3*n+1;
				iteraciones++;
			}
			if (n == 4) {
				serie[0] = 4;
				continue;
			}else if (n == 2 && serie[0] == 4) {
				serie[1] = 2;
				continue;
			}else {
				serie[0] = 0;
				if (iteraciones > 50) {
					mal = true;
					break;
				}
			}if (n == 1 && serie[1] == 2) {
				serie[2] = 1;
				dentro = false;
				break;
			}else{
				serie[1] = 0;
			}
		}
		if (mal) {
			System.out.println("He encontrado un contraejemplo a la Conjetura de Collatz, soy el mejor, quiero mi premio");
		}else {
			System.out.println(iteraciones);
		}
		
		
	}

}
