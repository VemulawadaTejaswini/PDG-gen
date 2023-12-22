

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		long n = (long) Math.sqrt(N);
		long ans=0;
		for(long i=1;i<=n;i++){
			if(N%i==0){
				//System.out.println((N/i)-1);
				if((((N/i)-1)!=i) && ((N/i)!=i))ans += ((N/i)-1);
			}
		}
		System.out.println(ans);
		
		
		sc.close();
	}
	
	
	
}
