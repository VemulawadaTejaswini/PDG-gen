import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] w = sc.next().toCharArray();
		
		int[] c = new int[26];
		for (int i = 0; i < w.length; i++) {
			int idx = w[i] - 'a';
			c[idx]++;
		}
		
		boolean isBeautiful = true;
		for (int num : c)
			if (num % 2 != 0) isBeautiful = false;
		
		String ans = isBeautiful ? "Yes" : "No";
		System.out.println(ans);
		
		sc.close();
	}
}


