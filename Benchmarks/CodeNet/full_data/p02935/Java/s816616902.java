import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] v = new int[n];
		for (int i = 0; i < n; i++)
			v[i] = in.nextInt();
		Arrays.sort(v);
		float r = (v[0] + v[1]) / 2l;
		for (int i = 2; i < n; i++)
			r = (r + (float) v[i]) / 2l;
		System.out.println(r);
	}
}