
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		char []s = sc.next().toCharArray();
		char []t = sc.next().toCharArray();
		
		char[]ans = new char [2*n];
		
		for(int i = 0 ;i < n;i++) {
			ans[2 *i] = s[i];
			ans[2 * i + 1] = t[i];
 		}
		
		String a = String.valueOf(ans);
		
		System.out.println(a);

	}

}
