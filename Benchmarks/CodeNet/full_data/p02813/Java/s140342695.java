import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	String P, Q;
	int result = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < N; ++i) {
			strBuilder.append(tokens[i]);
		}
		P = strBuilder.toString();
		tokens = in.readLine().split(" ");
		strBuilder = new StringBuilder();
		for (int i = 0; i < N; ++i) {
			strBuilder.append(tokens[i]);
		}
		Q = strBuilder.toString();
	}

	List<StringBuffer> sub(String str) {
		if (str.length() == 1) {
			List<StringBuffer> list = new ArrayList<>();
			StringBuffer buf = new StringBuffer();
			buf.append(str.charAt(0));
			list.add(buf);
			return list;
		} else {
			List<StringBuffer> list = new ArrayList<>();
			for (int i = 0; i < str.length(); ++i) {
				Character c = str.charAt(i);
				StringBuffer s = new StringBuffer(str);
				s.deleteCharAt(i);
				List<StringBuffer> subList = sub(s.toString());
				for (StringBuffer buf : subList) {
					buf.insert(0, c);
				}
				list.addAll(subList);
			}
			return list;
		}
	}

	void calc() {
		List<StringBuffer> list = sub(P);
		List<String> strList = new ArrayList<>(list.size());
		for (StringBuffer buf : list) {
			strList.add(buf.toString());
		}
		Collections.sort(strList);
		int p = Collections.binarySearch(strList, P);
		int q = Collections.binarySearch(strList, Q);
		result = Math.abs(q - p);
	}

	void showResult() {
		System.out.println(result);
	}
}