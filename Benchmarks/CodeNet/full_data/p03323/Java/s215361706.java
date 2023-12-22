import java.util.*;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(a==b||Math.abs(a-b)==1 ? "Yay" : ":(");
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}