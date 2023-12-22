//package atcoder;

import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			long N = sc.nextLong();
			ArrayList<Integer> array = new ArrayList<Integer>();
	        long i,j;
	        int count = 0;
			for(int x=1;x<=Math.sqrt(N);x++) {
				if(N%x==0) {
					array.add(x);
					//System.out.println(x);
					count ++;	
					//System.out.println(count);
		        }
         	}
			
			i = array.get(count-1);
			j = N/i;
			
			
			System.out.println((i-1)+(j-1));

	}
}