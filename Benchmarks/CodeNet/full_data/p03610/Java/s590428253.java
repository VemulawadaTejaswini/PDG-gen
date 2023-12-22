import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] str = s.toCharArray();
		String ans = "";
		for(int i = 0;i < str.length ; i += 2) {
			ans += str[i];
		}
		System.out.println(ans);
	}
}
