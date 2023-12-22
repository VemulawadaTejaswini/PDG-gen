import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
		int N = Integer.parseInt(sc.next());
		int L = Integer.parseInt(sc.next());
		String[] sss = new String[L];
		
		for (int i = 0; i < N; i ++) {
			sss[i] = sc.next();
		}
		StringBuilder sb = new StringBuilder();
		Arrays.stream(sss).sorted().forEach(sb::append);
		
		System.out.println(sb.toString()); 
	} // Scanner Close

	}
}