import java.util.Scanner;
	public class Main {
		
		static void solve() {
			Scanner sc = new Scanner(System.in);
			long a = sc.nextLong();
			long b = sc.nextLong();
			long k = sc.nextLong();
			sc.close();
			long res1 = Math.max(0, a - k);
			long res2 = Math.max(0, Math.min(a+b-k,b));
			System.out.println(res1 + " " + res2);
		}
		public static void main(String[] args) {	
			solve();
		}
	
	}
