import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a = 1;
		int digit = 1;
		if(n == 1) {
			digit = 1;
		}else {
			while(a<n) {
				a *= k;
				digit++;
			}
			digit--;
		}
		System.out.println(digit);
		sc.close();
	}
}