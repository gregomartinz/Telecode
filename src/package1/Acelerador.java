package package1;

import java.util.Scanner;

public class Acelerador {

	public Acelerador() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numVueltas = in.nextInt();
		boolean fuera = false;
		int[] vel = new int[100*numVueltas];
		for (int i = 0; i < 100*numVueltas; i++) {
			vel[i] = in.nextInt();
		}
		int total=0;
		for (int j = 0; j < vel.length; j++) {
			total += vel[j];
			if (total == 0 || total < 0) {
				System.out.println("ERROR");
				break;
			}
		}
		
		if (fuera) {
			
		}else {
			System.out.println(total);
		}
		
		
	}
}
