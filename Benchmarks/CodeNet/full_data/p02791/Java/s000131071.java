import java.math.*;
import java.util.*;
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int p[] = new int[n];
			
			
			int sum = 0;
			
			for(int i=0;i<n;i++) {
				p[i] = sc.nextInt();
			}
			
			int min = p[0];
			
			for(int i=0;i<n;i++) {
				if(min>=p[i]) {
					min = p[i];
					sum++;
				}
			}
			
			System.out.println(sum);
			
		}
				
	}