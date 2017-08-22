package package1;

import java.util.Scanner;

public class Accenture {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double result = 0;
		int radio = 6;
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		double area = 2*Math.PI*radio;
		double distancia = Math.sqrt(Math.abs(x2-x1)*Math.abs(x2-x1) + Math.abs(y2-y1)*Math.abs(y2-y1));
		if (distancia > 12) {
			result = 0;
		}else {
			double d = distancia/2;
			
			//double angulo = 2*Math.acos((d/2)*radio);
			
			//double a = radio*radio*(angulo-Math.sin(angulo));
			//double a = radio*radio*angulo/2 - (radio*radio*Math.sin(angulo/2));
			double a = (radio-distancia)*(radio-distancia) *((2*Math.PI/3)-(Math.sqrt(3)/2));
			//double a = 2*(radio*radio*Math.acos(distancia/2*radio)-distancia/4*Math.sqrt(4*radio*radio-distancia*distancia));
			
			
			result = 2*a/(area);
			
			
			System.out.println(distancia);
			
		}
		System.out.println(result + "%");
	}
	

}
