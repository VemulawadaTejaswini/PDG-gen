import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final  int N = Integer.parseInt(sc.nextLine());
		List<String> strs = new ArrayList<String>();

		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			str = sortChars(str);
			strs.add(str);

		}
		long ans = 0;
		for(int i = 0; i < N; i++) {
			String base = strs.get(i);
			for(int j = i + 1; j< N; j++) {
				String comp = strs.get(j);
				if(comp.equals(base)) {
					ans++;
				}
			}
		}
		System.out.println(ans);


	}

	static String sortChars(String str) {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

}
