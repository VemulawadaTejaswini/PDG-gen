import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		List<String> M = new ArrayList<String>();
		List<String> A = new ArrayList<String>();
		List<String> R = new ArrayList<String>();
		List<String> C = new ArrayList<String>();
		List<String> H = new ArrayList<String>();

		String now;
		for (int i = 0; i < N; i++) {
			now = br.readLine();
			switch (now.charAt(0)) {
			case 'M':
				//if (!M.contains(now))
					M.add(now);
				break;
			case 'A':
				//if (!A.contains(now))
					A.add(now);
				break;
			case 'R':
				//if (!R.contains(now))
					R.add(now);
				break;
			case 'C':
				//if (!C.contains(now))
					C.add(now);
				break;
			case 'H':
				//if (!H.contains(now))
					H.add(now);
				break;
			}
		}

		List<Integer> march = new ArrayList<Integer>(Arrays.asList(M.size(), A.size(), R.size(), C.size(), H.size()));

		for (int i = 4; i >= 0; i--) {
			if (march.get(i) == 0)
				march.remove(i);
		}

		long count = 0;

		for (int a = 0; a < march.size(); a++) {
			for (int b = a; b < march.size(); b++) {
				for (int c = b; c < march.size(); c++) {
					if (a == b || b == c || c == a) {
					} else {
						count += march.get(a) * march.get(b) * march.get(c);
					}
				}
			}
		}

		System.out.println(count);

	}
}