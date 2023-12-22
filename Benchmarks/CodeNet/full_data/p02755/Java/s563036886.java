import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();
		int ans = 0;
		int tmpa = ((a + 1) * 100) / 8;
		int tmpb = ((b + 1) * 100) / 10;
		int tmpbb = (b * 100) / 10;
		int tmpaa = (a * 100) / 8;
		if((a * 100) % 8 != 0)tmpaa++;
		ans = Math.max(tmpbb, tmpaa);
		if(tmpbb > tmpa || tmpaa > tmpb)ans = -1;
		// System.out.println(tmpaa + " <= x < "  + tmpa + " and " + tmpbb + " <= x < " + tmpb);
		System.out.println(ans);
	}
}
