import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> l = Arrays.asList(sc.nextLine().split(" "));
		int n = Integer.parseInt(l.get(0));
		int k = Integer.parseInt(l.get(1));
		String t = sc.nextLine();
		String changed = t.substring(k-1, k).toLowerCase();
		String answer = t.substring(0, k-1) + changed + t.substring(k, n);
		System.out.println(answer);
	}
}