import java.util.Scanner;

public class Main {
	
	public static boolean palindromic(int t) {
		String ans = String.valueOf(t);
		int n = ans.length();
		for(int i = 0; i < n / 2; ++i) {
			if(ans.charAt(i) != ans.charAt(n - i - 1))return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int ans = 0;
		sc.close();
		for(int i = a; i <= b; ++i) {
			if(palindromic(i))++ans;
		}
		System.out.println(ans);
	}

}
