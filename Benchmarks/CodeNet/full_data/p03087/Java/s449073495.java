import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int Q = reader.nextInt();
		String S = reader.next();
		String ans = "";
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N-1; i++) {
			if (S.charAt(i)=='A' && S.charAt(i+1)=='C') {
				list.add(i);
			}
		}
		for (int i = 0; i < Q; i++) {
			int beginIndex = reader.nextInt() - 1;
			int endIndex = reader.nextInt() - 1;
			int a = 0;
			for (int j = 0; j < list.size(); j++) {
				if ( beginIndex <= list.get(j)  && endIndex >= list.get(j)+1) {
					a++;
				}
			}
			ans += a + "\n";
		}
		System.out.println(ans);
		reader.close();
	}
}



