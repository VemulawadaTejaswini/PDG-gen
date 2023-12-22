import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int x = scan.nextInt();
		int y =scan.nextInt();
		long ans = 0;
		int a = x;
		int b = 0;
		while(a >= 0) {
			if(2*a + b == y) {
				break;
			}
			a = a - 2;
			b = b + 1;
			if(a < 0) {
				System.out.println(0);
				System.exit(0);
			}
		}
		Main instance = new Main();

		long f1 =instance.fac(a+b);
		long f2 = instance.fac(a)*instance.fac(b)%1000000007;
		long f3 = 1;
		while(f3 < 1000000007) {
			if((f3*f2)%1000000007 == 1) {
				break;
			}
			else {
				f3++;
			}
		}
		ans = (f1*f3)%1000000007;
		System.out.println(ans);

	}

	public long fac(int n) {
		long l = 1;
		while(n > 0) {
			l = (l*n)%1000000007;
			n--;
		}
		return l;
	}

}
