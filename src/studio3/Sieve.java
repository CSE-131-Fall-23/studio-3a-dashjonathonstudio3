package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	System.out.print("Prime numbers up to: ");
	int n = in.nextInt();
	boolean[] primes = new boolean[n];
	for (int a =0; a<n;a++) {
		primes[a] = true;
	}
	
	for (int i = 2;i<=Math.sqrt(n);i++) {
		if (primes[i] == true) {
			for (int j = i*i; j<n;j = j + (i+i)) {
				primes[j] = false;
			}
			
		}	
			for (int k = 0;k<n;k++) {
			if (primes[i]==true)
				System.out.println(i);
		}
		
			}
		}
	
	
	}

	




