import java.math.BigInteger;
import java.util.*;
public class Main {
	


	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		int[] ps = new int[n];
		
		for(int i=0;i<n;i++) {
			ps[i] = sc.nextInt();
		}
		
		int ans = 1;
		
		int min = ps[0];
		
		for(int i=1;i<n;i++) {
			if(min >= ps[i]) {
				ans++;
				min = ps[i];
			}
		}
		
		System.out.println(ans);




		
		
		
		
		

		


		
		
	}
	


}

 