import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		String ans = "";
		String U = "U";
		String D = "D";
		String L = "L";
		String R = "R";
		
		ans += repeat(U, ty - sy);
		ans += repeat(R, tx - sx);
		ans += repeat(D, ty - sy);
		ans += repeat(L, tx - sx);
		ans += "DR";
		ans += repeat(R, tx - sx);
		ans += repeat(U, ty - sy);
		ans += "UL";
		ans += "UL";
		ans += repeat(L, tx - sx);
		ans += repeat(D, ty - sy);
		ans += "DR";
		System.out.println(ans);
	}
	
	public static String repeat(String str, int num) {
		String return_str = ""; 
		for(int i = 0; i < num; i++) {
			return_str += str;
		}
		return return_str;
	}
}
