import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);

		String S = in.readLine();
		Set<Character> numbers = new HashSet<>();
		for (int i = 0; i < 10; ++i) {
			numbers.add(Integer.toString(i).charAt(0));
		}
		
		boolean valid = isValid(S, numbers, A);
		String str = valid? "Yes": "No";
		System.out.println(str);

	}

	static boolean isValid(String S, Set<Character> numbers, int A) {
		for(int i = 0; i < S.length(); ++i) {
			if(i == A) {
				if(S.charAt(i) != '-') {
					return false;
				}
			}else {
				if(!numbers.contains(S.charAt(i))) {
					return false;
				}
			}
		}
		return true;
	}
}
