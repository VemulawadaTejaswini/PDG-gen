import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int i = 0; //いったん保持する箱
		int j = 0; //いったん保持する箱

		i = x; //xをいれる i 1 x 1
		j = y; //zをいれる　j2
		x = y; // x 2 y2 223
		y = i; // x2 y1 z3 213　AB
		x = z; // x 3 y1 z3
		z = j; // x 3 y1 z1
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();
	}
}
