import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = sc.nextInt();
		int ans = x/500*1000+x%500/5*5;
		p(ans);
		
	}

}
