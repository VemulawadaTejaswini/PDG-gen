

import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();

		int[] bou=new int[N];
		for(int i=0; i<N; i++) {
			bou[i]=sc.nextInt();
		}
		Arrays.sort(bou);

		int counter=0;
		int wa=0;
		while(counter<K) {
			wa+=bou[N-1-counter];
			counter++;
		}
		System.out.println(wa);
	}
}