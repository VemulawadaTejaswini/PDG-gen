import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		Drink[] A = new Drink[N];
		for (int i = 0; i < N; i++) {
			A[i] = new Drink(scn.nextInt(), scn.nextInt());
		}
		Arrays.sort(A);
		long ans = 0;
		for(int i = 0;i < N;i++) {
			if(M > A[i].getMax()) {
				ans += A[i].getPrice() * A[i].getMax();
				M -= A[i].getMax();
			}else {
				ans += A[i].getPrice() * M;
				break;
			}
		}
		System.out.println(ans);
	}
}

class Drink implements Comparable<Drink>{
	long price, max;

	Drink(long price, int max) {
		this.price = price;
		this.max = max;
	}

	long getPrice() {
		return this.price;
	}

	long getMax() {
		return this.max;
	}

	@Override
	public int compareTo(Drink o) {
		if(this.getPrice() < o.getPrice()) {
			return -1;
		}else {
			if(this.getPrice() > o.getPrice()) {
				return 1;
			}else {
				return 0;
			}
		}
	}
}
