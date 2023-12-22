import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
			long e = sc.nextLong();
			// a,b,c,d,eで一番小さいやつが6回目以降に毎回減っていく
			long[] tmp = {a,b,c,d,e};
			Arrays.sort(tmp);
			long min = tmp[0];
			long ans = (long)Math.ceil((double)n / (double)min) + 4;
			System.out.println(ans);
		}

	}

}
