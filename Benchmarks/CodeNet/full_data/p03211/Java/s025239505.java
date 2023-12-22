
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans=753;
		String s = sc.next();
		for(int i=0;i<s.length()-2; i++) {
			int num = Math.abs(753 - Integer.parseInt(s.substring(i, i+3)));
			if(num < ans) ans = num;
		}
		System.out.println(ans);
	}
}
