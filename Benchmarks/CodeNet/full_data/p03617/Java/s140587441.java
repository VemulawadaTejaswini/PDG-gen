import java.util.*;

public class Main {
	public static class Bottle {
		int size;
		int price;
		public Bottle(int size, int price) {
			this.size = size;
			this.price = price;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bottle[] b = new Bottle[4];
		for(int i=0; i<4; i++)
			b[i] = new Bottle(1<<i, sc.nextInt());
		long N = sc.nextLong()*4;
		
		Arrays.sort(b, new Comparator<Bottle>() {
			public int compare(Bottle b1, Bottle b2) {
				return b1.price*b2.size - b2.price*b1.size;
			}
		});
		
		long ans = 0;
		for(int i=0; i<4; i++) {
			long buy = N/b[i].size;
			ans += buy*b[i].price;
			N -= buy*b[i].size;
		}

		System.out.println(ans);
		sc.close();
	}
	
	static int gcd(int a, int b) {
		return a==0 ? b : gcd(b%a, a);
	}
}
