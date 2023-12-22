
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = Integer.parseInt(sc.next());
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		int max = -1;
		int min = k+1;
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		
		}
		
		int ans = 0;
		
		for(int i = 0 ;i < n-1 ;i++) {
			if(a[i+1] - a[i] >= (double) k/2) {
				ans = k - a[i+1] +ans;
				break;
			}
			ans += a[i+1] - a[i]; 
		}
		System.out.println(ans);
	}		
	}
