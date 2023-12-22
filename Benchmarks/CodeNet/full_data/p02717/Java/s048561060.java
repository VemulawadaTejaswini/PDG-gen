import java.util.*;
class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.close();

		x = x ^ y;
		y = x ^ y;
		x = x ^ y;

		x = x ^ z;
		z = x ^ z;
		x = x ^ z;

		System.out.println(x + " " + y + " " + z);
	}
}