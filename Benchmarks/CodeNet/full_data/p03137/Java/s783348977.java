import java.util.Scanner;

import java.util.*;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] x = new int[m];
		int[] d = new int[m-1];


		for(int i = 0; i < m; i++){
			x[i] = scan.nextInt();
		}
		Arrays.sort(x);
		for(int i = 1; i < m ; i++){
			d[i-1] = Math.abs(x[i] - x[i-1]);
		//	System.err.println(d[i-1]);
		}
		Arrays.sort(d);

		int sum = 0;
		for(int i = 0; i <= d.length - n ; i++){
			sum += d[i];
		}
		System.out.println(sum);

	}
}
