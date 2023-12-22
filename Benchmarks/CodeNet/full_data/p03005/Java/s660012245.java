import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		if(K == 1) {
			System.out.println(0);
		}
		else {
			System.out.println(N-K);
		}

	}

}