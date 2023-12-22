import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long x = sc.nextLong();
		
		sc.close();
		
		long ans = n;
		long w = x;
		long h = n-x;
		while(true) {
			if(w < h) {
				long m = h/w;
				ans += 2*w*m;
				if(h%w == 0) {
					ans -= w;
					break;
				}
				h -= m*w;
			} else {
				long m = w/h;
				ans += 2*h*m;
				if(w%h == 0) {
					ans -= h;
					break;
				}
				w -= m*h;
			}
		}
		
		System.out.println(ans);
	}
	
}