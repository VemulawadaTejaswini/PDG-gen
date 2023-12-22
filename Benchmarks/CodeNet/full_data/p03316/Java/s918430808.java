import java.util.*;

public class Main {

	public static int s(int n) {
		String sn = String.valueOf(n);
		int ans = 0;
		for (int i = 0; i < sn.length(); ++i) {
			int tmp = (int) (sn.charAt(i) - '0');
			ans += tmp;
		}

		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String ans[] = {"Yes", "No"};
		int an = 0;
		int tmpans = s(n);
		if(n % tmpans != 0)an = 1;
		System.out.println(ans[an]);
	}

}
