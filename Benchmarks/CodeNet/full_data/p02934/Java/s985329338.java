import java.util.Scanner;
public class Main {
	
		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			double res = 0.0;
			for(int i = 0;i<n;i++) {
				res+=1.0/sc.nextDouble();
			}
			System.out.print(1.0/res);
			sc.close();
		}
	
	public static void main(String[] args){
		solve();
	}
}
