import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		int digit = 1;
		while (n >= k) {
			n = n / k;
			digit++;
		}
		print(digit);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}