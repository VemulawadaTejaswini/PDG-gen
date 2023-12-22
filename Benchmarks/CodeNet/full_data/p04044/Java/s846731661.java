import java.util.Arrays;
import java.util.Scanner;

public class IronaLovesStrings {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = in.nextInt();
		String[] strs = new String[n];
		
		for (int i  = 0; i < n; i++)
			strs[i] = in.next();
		
		Arrays.sort(strs);
		
		String ans = "";
		for (int i = 0; i < n; i++) {
			ans += strs[i];
		}
		
		System.out.println(ans);
	}
}
