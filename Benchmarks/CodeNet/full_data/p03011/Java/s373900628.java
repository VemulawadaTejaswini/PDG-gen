import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		System.out.println(P+Q+R-Math.max(P, Math.max(Q, R)));

	}

}
