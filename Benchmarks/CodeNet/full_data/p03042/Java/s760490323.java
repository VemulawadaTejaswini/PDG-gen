import java.util.Scanner;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int aa = n/100;
			int bb = n%100;
			if(aa<=12&&bb<=12) {
				System.out.println("AMBIGIOUS");
			}
			else if(aa<=12&&aa!=0&&bb>12) {
				System.out.println("MMYY");
			}
			else if(aa>12&&bb<=12&&bb!=0) {
				System.out.println("YYMM");
			}
			else {
				System.out.println("NA");
			}
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}