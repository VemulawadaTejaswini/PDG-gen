import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(), b = sc.nextLong(), x = sc.nextLong();
		System.out.println(b / x - a / x + ((b % x == 0) ? 1 : 0));
	}
}