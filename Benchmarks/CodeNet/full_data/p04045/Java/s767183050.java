import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String[] a = new String[k];
		for (int i = 0; i < k; i++)	a[i] = sc.next();
		
		for (int i = n;; i++) if (f(i, a)) { System.out.println(i); return; }
	}
	
	static boolean f(int in, String[] a) {
		return !Stream.of(a).anyMatch(s -> String.valueOf(in).contains(s));
	}
}
