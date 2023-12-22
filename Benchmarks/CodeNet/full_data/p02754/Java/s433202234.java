import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextInt();
		long a = scan.nextInt();
		long b = scan.nextInt();
		long ans = 0;
		
		if(a==0) {
			System.out.println(0);
			System.exit(0);
		}else if(b==0) {
			System.out.println(n);
			System.exit(0);
		}else if(n<a+b) {
			if(n<a) {
				System.out.println(n);
				System.exit(0);
			}else {
				System.out.println(a);
				System.exit(0);
			}
		}
		
		
		long x = n/(a+b);
		long y = n%(a+b);
		
		System.out.println(y);
		if(y>a) {
			ans += y-b;
		}else {
			ans += y;
		}
		System.out.println(ans+(x*a));
		
	}	
}
