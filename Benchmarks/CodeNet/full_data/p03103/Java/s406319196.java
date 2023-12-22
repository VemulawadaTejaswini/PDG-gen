package at_coder;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long M = sc.nextInt();
		long Ai = 0;
		long Bi = 0;
		
		
		TreeMap <Long, Long> store = new TreeMap <Long, Long>();
		
		for (int i = 0; i<N; i++){
			Ai = sc.nextLong();
			Bi = sc.nextLong();
 
			if (store.containsKey(Ai)) 
				store.put(Ai, store.get(Ai) + Bi);
			 else 
				store.put(Ai, Bi);
			}
		sc.close();
		
		long price = 0;
		long buy = 0;
		
		for (Long cost : store.keySet()) {
			buy = Math.min(M, store.get(cost));
			price = price + cost*buy;
			M=M-buy;
			
			if (M==0)
				break;
		}
		System.out.println(price);
			
	}
}
	
	        

		