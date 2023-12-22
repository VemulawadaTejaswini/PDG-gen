import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m1 = in.nextInt();
		int d1 = in.nextInt();
		int m2 = in.nextInt();
		int d2 = in.nextInt();

		if (m1 != m2)
			System.out.println(1);
		else
			System.out.println(0);
	}
}