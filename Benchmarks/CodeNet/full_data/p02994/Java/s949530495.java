import java.math.BigInteger;
import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		

		int n = sc.nextInt();
		int l = sc.nextInt();
		
		
		int[] tastes = new int[n];
	
		
		for(int i=0; i<n ;i++) {
			tastes[i] = l + i;
		}
		
		int min = tastes[0];
		int minabs = Math.abs(tastes[0]);
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			sum += tastes[i];
			if (minabs > Math.abs(tastes[i])) {
				min = tastes[i];
				minabs = Math.abs(tastes[i]);
			}
		}
		
		System.out.println(sum - min);

		
		
	}
	
}

