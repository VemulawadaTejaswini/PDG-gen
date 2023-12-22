import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		// ------------------------------------------------
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int tap = 1;
		int ret = 0;
		for (int i = 0; i < 100; i++) {
			if (tap >= b) {
				ret = i;
				break;
			}
			tap -= 1;
			tap += a;
		}

		out.println(ret);

		// ------------------------------------------------
		sc.close();
		out.flush();
	}
}