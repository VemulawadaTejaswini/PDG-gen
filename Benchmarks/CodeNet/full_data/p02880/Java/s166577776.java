import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		for (int i=1; i<=9; i++) {
			if (a%i != 0)
				continue;
			int b = a/i;
			if (b >= 1 && b <=9) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}
}

