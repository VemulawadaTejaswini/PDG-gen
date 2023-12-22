import java.util.Scanner;

public class Main {
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		String s = "";

		while (true) {
			if (N%-2 == 0) {
				s = "0" + s;
			} else {
				s = "1" + s;
				N--;
			}
			if (N/-2==0) break;
			N /= -2;
		}
		System.out.println(s);
	}
}