import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		ArrayList<Integer> x = new ArrayList<>();
		for(int i = 0;i < N;++i)
			x.add(sc.nextInt());
		sc.close();
		
		if(N == 1) {
			System.out.println(Math.abs(X - x.get(0)));
		} else {
			x.add(X);
			int[] x2 = new int[N];
			for(int i = 0;i < N;++i)
				x2[i] = x.get(i);
			Arrays.sort(x2);
			
			int[] sub = new int[N-1];
			for(int i = 0;i < N-1;++i)
				sub[i] = Math.abs(x2[i+1] - x2[i]);
			
			int gcd = IntStream.of(sub).mapToObj(BigInteger::valueOf).reduce(BigInteger::gcd).orElse(BigInteger.ZERO).intValue();
			
			System.out.println(gcd);
		}
	}
}
