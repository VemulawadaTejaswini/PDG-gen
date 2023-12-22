import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		int X = Integer.parseInt(in.readLine());
		List<Integer> list = new ArrayList<>();
		list.add(1);
		for (int i = 2; i <= 33; ++i) {
			int base = i;
			int val = i * i;
			while (val <= X) {
				list.add(val);
				val *= base;
			}
		}
		Collections.sort(list);
		Collections.reverse(list);
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i) <= X) {
				System.out.println(list.get(i));
				return;
			}
		}
	}

	void calc() {
	}

	void showResult() {
	}
}
