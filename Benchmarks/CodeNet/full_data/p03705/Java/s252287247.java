package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		ArrayList<Integer> sums = new ArrayList<Integer>();
		int[] num = new int[N];
		Integer sum = 0;
		for(int i = 0; i < N; i++){
			if(i < N - 1)
				num[i] = A;
			else
				num[i] = B;
			sum += num[i];
		}
		if(A < B)
			sums.add(sum);
		for(int j = A + 1; j <= B; j++){
			for(int i = N - 2; 0 < i; i--){
				num[i] = j;
				sum = 0;
				for(Integer k: num)
					sum += k;
				if(!sums.contains(sum))
					sums.add(sum);
			}
		}
		System.out.println(sums.size());
	}
}
