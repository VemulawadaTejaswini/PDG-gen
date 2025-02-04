import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		long[] a = new long[n];
		long length = 0;
		for (int i=0; i<n; i++) {
			a[i] = in.nextInt();
			length += a[i];
		}

		long left = 0;
		long closest = Integer.MAX_VALUE;
		for (int i=0; i<n; i++) {
			left += a[i];
			long right = length - left;
			if (Math.abs(left - right) < closest)
				closest = Math.abs(left - right);
		}

		System.out.println(closest);
	}
}

