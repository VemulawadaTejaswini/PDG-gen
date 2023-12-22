import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] num = new int[s.length()+1];
		for(int i = 0; i < num.length; i++) {
			num[i] = 0;
		}
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='<' ) {
				num[i+1] = Math.max(num[i+1],num[i]+1);
			}
		}
		for(int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i)=='>') {
				num[i]=Math.max(num[i+1]+1, num[i]);
			}
		}
		int ans = 0;
		for(int i = 0; i < num.length; i++) {
			ans += num[i];
		}
		System.out.println(ans);
	}
}