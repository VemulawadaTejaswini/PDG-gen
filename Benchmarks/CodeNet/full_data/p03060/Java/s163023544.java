import java.util.Scanner;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] V = new int[N];
		int [] C = new int [N];
		
		for (int i=0; i<N; i++) {
			V[i] = sc.nextInt();
		}
		int total = 0;
		for (int i=0; i<N; i++) {
			C[i] = sc.nextInt();
			if(V[i]>C[i]) {
				total += V[i] - C[i];
			}
		}
		

		System.out.println(total);
		
		
		
	}
}	
