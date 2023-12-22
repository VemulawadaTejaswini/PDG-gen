import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int ans = 0;
		
		for(int i=1;i<=k;i++) {
			for(int j=1;j<=k;j++) {
				
				int first = gcd(i,j);
				for(int l=1;l<=k;l++) {
					ans += gcd(first,l);
				}
			}
		}
		
		System.out.println(ans);
	}	
	
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
	
}
