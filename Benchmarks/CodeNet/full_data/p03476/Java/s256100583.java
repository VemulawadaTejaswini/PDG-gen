import java.util.BitSet;
import java.util.Scanner;

public class Main {
	static final int SIEVE = 10000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BitSet prime = new BitSet(SIEVE);
		prime.flip(2, SIEVE);
		for (int i = 2;i < SIEVE;++ i) if (prime.get(i)) for (int j = 1;i *j < SIEVE;++ j) prime.set(i*j, false);
		int like[] = new int[100002];
		like[0] = 0;
		for (int i = 1;i <= 100000;++ i) like[i + 1] = like[i] + (prime.get(i) & prime.get(i + 1 >> 1) ? 1 : 0);
		int Q = sc.nextInt();
		while((Q--) != 0) {
			int l = sc.nextInt(), r = sc.nextInt()+1;
			System.out.println(like[r] - like[l]);
		}
		sc.close();
	}
}
