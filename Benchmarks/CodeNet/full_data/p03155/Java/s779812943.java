import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();
		System.out.println((N - H + 1) * (N - W + 1));
		
	}
}
