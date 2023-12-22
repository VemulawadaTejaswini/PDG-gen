import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		byte[] st = sc.next().getBytes();

		int num = 0;
		if (st[0] == 'o') {
			num++;
		}

		if (st[1] == 'o') {
			num++;

		}

		if (st[2] == 'o') {
			num++;
		}

		System.out.println(700 + num * 100 + "円");

	}
}
