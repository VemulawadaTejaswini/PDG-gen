import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		int total = 0;
		while (t-- > 0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			total += r - l + 1;
		}

		System.out.println(total);
	}
}
