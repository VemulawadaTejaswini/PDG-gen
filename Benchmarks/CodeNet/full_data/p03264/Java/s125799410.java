import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		pattern(k);
	}
	static void pattern(int k) {
		int n = 0;
		if(k%2==0) {
			n = (k/2)*(k/2);
		}else {
			n = (k - 1)/2 * ((k - 1)/2 + 1);
		}
		System.out.println(n);
	}
}
