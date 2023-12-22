import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();

		int hachi = (int) (A / 0.08);

		int ans = 0;
		double s = 0.1;
		while(s == 1.0){
			ans = (int)(hachi * 0.1);
			if (B == ans) {
				System.out.println(hachi);
				break;
			hachi = (int) ((A + s) / 0.08);
			s = s +0.1;
		}
		if (s <= 1) {
			System.out.println(-1);
		} 

	}
}