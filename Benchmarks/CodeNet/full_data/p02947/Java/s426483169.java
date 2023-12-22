import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final List<String> S = Stream.generate(s::next).limit(N).map(l -> {
				char[] ary = l.toCharArray();
				Arrays.sort(ary);
				return new String(ary);
			}).sorted().collect(Collectors.toList());

			String prev = null;
			long cnt = 0;
			long ret = 0;
			for (String str : S) {
				if (!str.equals(prev)) {
					ret += cnt * (cnt - 1) / 2;
					cnt = 1;
					prev = str;
				} else {
					cnt++;
				}
			}
			ret += cnt * (cnt - 1) / 2;
			System.out.println(ret);
		}
	}
}
