import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e =0;
		while(true) {
			if(b >=a) {
				if(a % c ==0 || a % d == 0) {

				}else {
					e++;
				}
			}else {
				break;
			}
			a++;
		}
		System.out.println(e);
	}
}