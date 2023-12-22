import java.util.*;
import java.io.*;

public class Main {

	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sA = br.readLine().split(" ", n);
		String[] sB = br.readLine().split(" ", n);
		String[] sC = br.readLine().split(" ", n);
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		int[] arrC = new int[n];
		for (int i = 0; i < n; i++) {
			arrA[i] = Integer.parseInt(sA[i]);
			arrB[i] = Integer.parseInt(sB[i]);
			arrC[i] = Integer.parseInt(sC[i]);
		}
		Arrays.sort(arrB);
		Arrays.sort(arrC);
		int[] arrCountB = new int[n];
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arrB[i] < arrC[j]) {
					count = n - j;
					break;
				}
			}
			arrCountB[i] = count;
		}
		for (int i = n - 2; i >= 0; i--) {
			arrCountB[i] += arrCountB[i + 1];
		}
		int total = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arrA[i] < arrB[j]) {
					total += arrCountB[j];
					break;
				}
			}
		}
		System.out.println(total);
	}
}
