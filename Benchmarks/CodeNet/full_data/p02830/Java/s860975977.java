import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] wordArr = sc.nextLine().split(" ");
		sc.close();
		
		String ans = "";
		
		for(int i = 0; i < n; i++) {
			ans += wordArr[0].substring(i, i + 1) + wordArr[1].substring(i, i + 1);
		}
		
		System.out.println(ans);
	}
}
