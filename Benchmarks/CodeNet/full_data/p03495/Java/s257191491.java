package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n =sc.nextInt();
		int k =sc.nextInt();
		Integer[] balls =new Integer[n];
		for (int i=0;i<n;i++) {
			balls[i] =0;
		}
		for (int i=0;i<n;i++) {
			balls[sc.nextInt()-1] ++;
		}
		Arrays.sort(balls, Collections.reverseOrder());
		int ans =0;
		for (int j=k;j<n;j++) {
			ans += balls[j];
		}
		System.out.println(ans);
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
}