package package1;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Apuestas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
		int cuotas = in.nextInt();
		int dinero = in.nextInt();
		double[] c = new double[cuotas];
		double[] apostar = new double[cuotas];
		for (int i = 0; i < cuotas; i++) {
			c[i] = in.nextDouble();
		}		
		double pfb = 0;
		for (int i = 0; i < c.length; i++) {
			pfb += 1/c[i];
		}
		double pfp = 1/pfb;
		double profit = (dinero*pfp) - dinero;
		if (profit > 0 || profit == 0) {
			for (int i = 0; i < apostar.length; i++) {
				apostar[i] = pfp*dinero/c[i];
				DecimalFormat df = new DecimalFormat();
				df.setMaximumFractionDigits(2);
				System.out.println(df.format(apostar[i]));				
			}
		}else {
			System.out.println("IMPOSIBLE");
		}
	}
}
