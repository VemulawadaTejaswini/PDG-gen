import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public final class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int n = Integer.parseInt(in[0]);
		int t = Integer.parseInt(in[1]);
		int[] arr = new int[n];
		in = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(in[i]);
		}
		System.out.println(new Solver().solve(arr, t));
	}
}

class Solver {

	int solve(int[] a, int t) {
		int[] temp = new int[a.length];
		int min = a[0], maxCnt = 0;
		for (int i = 1; i < a.length; i++) {
			if (min > a[i - 1]) {
				min = a[i - 1];
			}
			temp[i] = (a[i] - min);
		}
		int max = Arrays.stream(temp).max().getAsInt();
		for (int i = 1; i < temp.length; i++) {
			if (temp[i] == max) {
				maxCnt++;
			}
		}
		return maxCnt;
	}
}
