import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int ans = 0;
		
		if(a==0) {
			System.out.println(0);
			System.exit(0);
		}else if(b==0) {
			System.out.println(n);
			System.exit(0);
		}
		
		int x = n/(a+b);
		int y = n%(a+b);
		if(y>a) {
			ans += y-b;
		}else {
			ans += y;
		}
		System.out.println(ans+(x*a));
		
	}	
}
