import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	long[] A;
	Queue<Long> queue;
	List<String> logs;

	Main(int N, long[] A) {
		this.N = N;
		this.A = A;
		this.queue = new PriorityQueue<>();
		for (int i = 0; i < N; ++i) {
			queue.add(A[i]);
		}
		this.logs = new ArrayList<>();

		calc();
		show();
	}

	void calc() {
		while (queue.size() > 2) {
			long first = queue.poll();
			long second = queue.poll();
			long diffA = Math.abs(queue.peek() - (first - second));
			long diffB = Math.abs(queue.peek() - (second - first));
			if (diffA >= diffB) {
				queue.add(first - second);
				this.logs.add(first + " " + second);
			} else {
				queue.add(second - first);
				this.logs.add(second + " " + first);
			}
		}
		long s = queue.poll();
		long f = queue.poll();
		queue.add(f - s);
		this.logs.add(f + " " + s);

	}

	void show() {
		System.out.println(queue.poll());
		for (int i = 0; i < this.logs.size(); ++i) {
			System.out.println(this.logs.get(i));
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		long[] A = new long[N];
		String[] tokens = in.readLine().split(" ");

		in.close();
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}

		Main ins = new Main(N, A);

	}

}