


import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long A=sc.nextLong(),B=sc.nextLong(),C=sc.nextLong(),D=sc.nextLong();
		long count=0;
		long CD=C*D;
		long temp=0;
		long countA = 0;
		long countB = 0;
	
		long init=C*(A/C);
		if(init<A) {
			init=C*(A/C+1);
		}
		for(long i=init;i<=B;i+=C) {
			countA++;
		}
		init=D*(A/D);
		if(init<A) {
			init=D*(A/D+1);
		}
		for(long i=init;i<=B;i+=D) {
			if(i%C!=0) {
				countB++;
			}
		}
		
		count=B-A+1-countA-countB;
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
	
		
		
}
}