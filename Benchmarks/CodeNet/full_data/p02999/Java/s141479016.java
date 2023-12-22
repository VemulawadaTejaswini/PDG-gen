package begi130;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long[] a = new long[N];
		for ( int i = 0; i < N; i++ )
			a[i] = sc.nextLong();	
		
		int sum=0,count=0;
		int start=0,end=0;
		
		while(start<N){
			for(;sum<K && end<N;end++)
				sum+=a[end];
			
				if ( K <= sum ) count += (N - end+1);
				else if ( N == end ) break;
				//System.out.println("a"+count);
				//System.out.println(sum);

				sum -= a[start++];  //9 12 9
				
				
			
		}
		
		System.out.println(count);
	}

}
