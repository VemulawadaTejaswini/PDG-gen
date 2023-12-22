import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong() % 2019;
		long R = sc.nextLong() % 2019;
		long ans = Integer.MAX_VALUE;
		for(int i = (int)L; i < R; i++)
			for(int j = i+1; j <= R; j++)
				ans = Math.min(ans, (i*j) % 2019);
		System.out.println(ans);

	}

}
