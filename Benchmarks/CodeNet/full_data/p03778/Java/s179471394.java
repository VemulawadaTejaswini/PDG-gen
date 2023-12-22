import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if( a <=b ) {
			if(w + a < b) {
				System.out.println(Math.abs(w + a -b));
			}else {
				System.out.println(0);
			}
		}else {
			if(w + b < a) {
				System.out.println(Math.abs(w + b -a));
			}else {
				System.out.println(0);
			}
		}
		}
}