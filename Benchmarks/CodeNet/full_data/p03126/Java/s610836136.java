import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ", 2);
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int[] menues = new int[m + 1];
		for (int i = 0; i < n; i++) {
			arr = br.readLine().split(" ");
			int k = Integer.parseInt(arr[0]);
			for (int j = 1; j <= k; j++) {
				int a = Integer.parseInt(arr[j]);
				menues[a]++;
			}
		}
		int count = 0;
		for (int x : menues) {
			if (x == n) {
				count++;
			}
		}
		System.out.println(count);
	}
}
