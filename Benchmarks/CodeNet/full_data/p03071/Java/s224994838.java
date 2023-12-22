import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, fim=0;
		Scanner scanner = new Scanner(System.in);

		a = scanner.nextInt();
		b = scanner.nextInt();
		
		for(int i = 0; i < 2; i++) {
			if(a > b) {
				fim += a;
				a--;
			}else if(b > a) {
				fim += b;
				b--;
			}else if(b == a) {
				fim += a;
				a--;
			}
		}
		System.out.println(fim);
	}
}
