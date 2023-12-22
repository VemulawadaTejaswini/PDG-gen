import java.util.*;
import java.math.*;
public class Main {
	static int r; 
	static int c;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		boolean[] ans = new boolean[1001];
		for(int i = 1; i < 1001; i++) {
			int eight = (int)(i * 0.08);
			int ten = (int) (i * 0.1);
			ans[i] = ((eight == a) && (ten == b));
		}
		String res = "-1";
		for(int i = 1; i < 1001; i++) {
			if(ans[i] == true) {
				res = i + "";
				break;
			}
		}
		System.out.println(res);
	}
} 
