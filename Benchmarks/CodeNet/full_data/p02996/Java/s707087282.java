import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Task[] arr = new Task[n];
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			Task t = new Task();
			t.a = Integer.parseInt(sa[0]);
			t.b = Integer.parseInt(sa[1]);
			arr[i] = t;
		}
		br.close();

		Arrays.parallelSort(arr);

		long sum = 0;
		for (int i = 0; i < n; i++) {
			Task t = arr[i];
			sum += t.a;
			if (sum > t.b) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	static class Task implements Comparable<Task> {
		int a, b;

		public int compareTo(Task o) {
			return b - o.b;
		}
		
	}
}
