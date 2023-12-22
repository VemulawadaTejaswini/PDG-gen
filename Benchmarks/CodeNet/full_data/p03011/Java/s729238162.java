

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();

		if (p < q)
			System.out.println(Math.min(q, r) + p);
		else
			System.out.println(Math.min(p, r) + q);
	}

}
