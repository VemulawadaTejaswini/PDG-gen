import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		if(N <= K) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
