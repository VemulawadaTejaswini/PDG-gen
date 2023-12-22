import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	int X, Y, A, B, C;
	long[] p, q, r;
	List<Tuple> list;

	static class Tuple {
		long val;
		int type;

		Tuple(long val, int type) {
			this.val = val;
			this.type = type;
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		X = Integer.parseInt(tokens[0]);
		Y = Integer.parseInt(tokens[1]);
		A = Integer.parseInt(tokens[2]);
		B = Integer.parseInt(tokens[3]);
		C = Integer.parseInt(tokens[4]);
		p = new long[A];
		q = new long[B];
		r = new long[C];
		list = new ArrayList<>(A + B + C);
		tokens = in.readLine().split(" ");
		for (int i = 0; i < A; ++i) {
			p[i] = Long.parseLong(tokens[i]);
			list.add(new Tuple(p[i], 1));
		}
		tokens = in.readLine().split(" ");
		for (int i = 0; i < B; ++i) {
			q[i] = Long.parseLong(tokens[i]);
			list.add(new Tuple(q[i], -1));
		}
		tokens = in.readLine().split(" ");
		for (int i = 0; i < C; ++i) {
			r[i] = Long.parseLong(tokens[i]);
			list.add(new Tuple(r[i], 0));
		}
		Collections.sort(list, new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				return -1 * Long.compare(o1.val, o2.val);
			}
		});
	}

	void calc() {
		long sum = 0;
		int cMax = X + Y;
		int xNum = 0;
		int yNum = 0;
		int index = 0;
		int count = 0;
		while (count < X + Y) {
			Tuple tuple = list.get(index);
			if (tuple.type == 0) {
				if (cMax > 0) {
					cMax--;
					sum += tuple.val;
					++count;
				}
			} else if (tuple.type == 1) {
				if (xNum < X) {
					xNum++;
					sum += tuple.val;
					++count;
				}
			} else {
				if (yNum < Y) {
					yNum++;
					sum += tuple.val;
					++count;
				}
			}
			++index;
		}
		System.out.println(sum);
	}

	void showResult() {
	}

}
