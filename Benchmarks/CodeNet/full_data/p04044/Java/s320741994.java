import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();

		Set<String> strset = new TreeSet<String>();

 		for (int i = 0; i < N; i++) {
			strset.add(sc.next());
		}
 		StringBuilder sb = new StringBuilder();
 		for (String string : strset) {
 			sb.append(string);
		}

 		System.out.println(sb.toString());

	}

}