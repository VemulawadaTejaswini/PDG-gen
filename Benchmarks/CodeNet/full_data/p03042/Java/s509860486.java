import java.util.Scanner;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int aa = n/100;
			int bb = n%100;
			String ans;
			if(aa<=12&&aa!=0&&bb<=12&&bb!=0) {
				ans = "AMBIGIOUS";
			}
			else if(aa<=12&&aa!=0&&bb>12) {
				ans = "MMYY";
			}
			else if(aa>12&&bb<=12&&bb!=0) {
				ans = "YYMM";
			}
			else {
				ans = "NA";
			}
			sc.close();
			System.out.println(ans);
		}
	public static void main(String[] args) {
		solve();

	}

}
