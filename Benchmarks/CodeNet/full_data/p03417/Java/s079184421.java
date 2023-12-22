import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		sc.close();
		long ans = 0;
		if(N == 1 && M == 1) ans = 1;
		else if((N == 1)||( M == 1)) ans = (N * M) - 2;
		else ans = (N - 2) * (M - 2);
		System.out.println(ans);
	}
}
