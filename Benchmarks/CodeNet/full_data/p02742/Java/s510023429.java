import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		long a = (long) H / 2L * W;
		if (H % 2 == 1) {
			a += (W + 1) / 2;
		}
		System.out.println(a);
	}
}
