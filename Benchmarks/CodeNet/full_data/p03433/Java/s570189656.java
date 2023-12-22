import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt(); int a = sc.nextInt();

		while (n>=500) {
			n = n - 500;
		}

		System.out.println (n-a <= 0 ? "Yes" : "No");
	}
}
