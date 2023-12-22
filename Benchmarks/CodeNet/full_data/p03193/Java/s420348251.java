import java.util.*;

public class Main {
	int N;
	long H, W;
	List<Long> A, B;
	int result = 0;

	void calc() {
		for (int i = 0; i < N; ++i) {
			if (A.get(i) >= H && B.get(i) >= W) {
				result++;
			}
		}
	}

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		H = in.nextLong();
		W = in.nextLong();
		this.A = new ArrayList<>(N);
		this.B = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			this.A.add(in.nextLong());
			this.B.add(in.nextLong());
		}
		in.close();
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.result);
	}

}