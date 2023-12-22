
import java.util.Scanner;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int k = sc.nextInt();
			int x = sc.nextInt();
			sc.close();
			for(int  i = x-k+1;i<x+k;i++) {
				System.out.print(i+" ");
			}
		}
	public static void main(String[] args) {
		solve();

	}

}
