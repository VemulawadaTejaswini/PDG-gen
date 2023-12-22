import java.util.*;

public class Main {
public static void main(String[] args) {

			Scanner keyboard = new Scanner(System.in);

			 int N = keyboard.nextInt();
			 int ans = 0;
			
			for (int a=1; a<=N; a++) {
				for(int b=1; b<=N; b++) {
					int B = gcd(a, b);
					for(int c=1; c<=N; c++) {
						int C =  gcd(B, c);
						ans += C;
					}
				}
			}			
		
		System.out.println(ans);
		keyboard.close();	
	}
	
	private static int gcd(int m, int n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
        }
}
