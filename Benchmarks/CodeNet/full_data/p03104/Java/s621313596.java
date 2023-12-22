import java.util.Scanner;

public class Main {
	static int MAX_DIGIT = 60;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		sc.close();

		long[] bit = new long[MAX_DIGIT+1];

		for(int d = 60;d >= 0;d--) {
			for(long num = b;num>=a;num--) {
				long mask = 1L << d;
				if((num&mask)!=0)bit[d]++;
			}
		}
		for(int d = 60;d >=0;d--) {
			bit[d] %= 2;
			//System.out.print(bit[d] +" ");
		}
		//System.out.println();
		long res = 0;
		long bairitu = 1;
		for(int d = 0;d <= MAX_DIGIT;d++) {
			//System.out.println(bit[d] * bairitu);
			res += (bit[d] * bairitu);
			bairitu *= 2;
			//System.out.print(bit[d] +" ");
		}
		System.out.println(res);
	}

}
