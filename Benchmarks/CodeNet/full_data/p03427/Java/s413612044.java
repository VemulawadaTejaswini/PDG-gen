import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] n = sc.next().toCharArray();
		boolean flag = false;
		for(int i = 1; i < n.length; i++) {
			if(n[i] != '9') {
				flag = true;
				break;
			}
		}
		int ans = 0;
			for(int i = 0; i < n.length; i++) {
				ans += n[i]-'0';
			}
		if(flag) {
			ans--;
		}
		System.out.println(ans);
	}
}