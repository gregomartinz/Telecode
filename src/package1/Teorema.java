package package1;

import java.math.BigInteger;
import java.util.Scanner;

public class Teorema {



	public static void main(String[] args) {
		
		BigInteger[] primos = new BigInteger[10^10];
		int a = 0;
		for (int i = 0; i < primos.length; i++) {
			if (isPrime(i)) {
				primos[a]=i;
				i 
			}
		}
		
		Scanner in = new Scanner(System.in);
		Integer n = in.nextInt();
		if (isPrime(n)) {
			System.out.println("Es primo");
		}else {
			
		}
	}
	
	public static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public void factores(int numero1){

        for(int i=2;i<numero1;i++){

            while(numero%i==0){
                numero=numero/i;
                 if(numero==1){
                    System.exit(0);
                }
            }
        }

}
