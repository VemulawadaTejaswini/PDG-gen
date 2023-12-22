import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long ans;
		if((B-A) % 2 == 0)
			ans = (B-A)/2;
		else
			ans = Math.min(A+(B-A)/2, (N-B+1)+(B-A)/2);
		System.out.println(ans);

	}

}
