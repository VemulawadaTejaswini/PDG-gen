import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = s.length();
		int p_l = l-7;
		String set_s = "";
		int ok_flg = 0;

		for (int j=0; j<p_l; j++) {
			set_s = s.substring(0,j) + s.substring(j+p_l,l);
			if (set_s.equals("keyence")) {
				ok_flg = 1;
				break;
			}
		}
		
		if (ok_flg == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}