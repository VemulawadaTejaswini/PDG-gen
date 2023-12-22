import java.util.Scanner;

public class Main{
	static int res = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] cnt = new int[2];
		String s = sc.nextLine();
		
		for(int i = 0; i < s.length(); i++) {
			cnt[s.charAt(i) - '0']++;
		}
		
		int ans = Math.min(cnt[0], cnt[1]) * 2;
		
		System.out.println(ans);	
	}
}