import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		sc.close();

		if (d == 0) {
			System.out.println(n);
		} else {
			int pow = (int) Math.pow (100, d);
			int res = n * pow;
			System.out.println(res);
		}
	
	}
}
