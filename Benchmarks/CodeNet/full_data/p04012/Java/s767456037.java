import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] w = sc.next().toCharArray();
		int[] cnt = new int[26];
		for (int i = 0; i < w.length; i++) {
			cnt[w[i] - 'a']++;
		}
		
		boolean isBeautiful = true;
		for (int num : cnt) {
			if (num % 2 != 0) {
				isBeautiful = false;
				break;
			}
		}
		
		String ans = isBeautiful ? "Yes" : "No";
		System.out.println(ans);
		
		sc.close();
	}
}

