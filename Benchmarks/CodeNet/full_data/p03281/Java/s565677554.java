

import java.util.*;

public class Main {
	
	public static int eightdivisors(int n) {
		int divisors = 0;
		int output;
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				divisors++;
			}
		}
		
		if(divisors != 8) {
			output = 0;
		} else {
			output = 1;
		}
		
		return output;
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int amount = 0;
		
		int i = 1;		
		while(i <= N) {
			amount += eightdivisors(i);
			i += 2;
		}
		
		System.out.println(amount);
	}

}
