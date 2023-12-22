import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = sc.nextInt();
		
		int[] x = new int[n];
		long sum = 0;
		
		for(int i = 0; i<x.length; i++) {
			x[i] =sc.nextInt();
			
			if(i != 0) {
				if(x[i]-x[i-1] > t) {
					sum += t;
				}else{
					sum += x[i] - x[i-1];
				}
			}	
		}
		
		sum += t;
		
		System.out.println(sum);
		
		
		sc.close();

	}

}