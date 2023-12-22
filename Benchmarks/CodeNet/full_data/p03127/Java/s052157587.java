import java.util.*;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A1 = sc.nextInt();
		int A2 = sc.nextInt();
		int gd = gcd(A1,A2);
		for(int i=2;i<N;i++) {
			gd = gcd(gd, sc.nextInt()); 
		}
		System.out.println(gd);
		
	}
	
	public static int gcd(int a, int b) {
		int x = Math.max(a, b);
		int y = Math.min(a, b);
		if(x%y==0) return y;
		else return gcd(y, x%y);
	}
}
