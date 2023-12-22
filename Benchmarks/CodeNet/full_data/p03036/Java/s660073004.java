import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int D = sc.nextInt();
		int x_2000 = sc.nextInt();
		long crt = x_2000;
		for(int i = 0; i < 10; i ++) {
			crt = crt *r - D;
			System.out.println(crt);
		}
	}
}