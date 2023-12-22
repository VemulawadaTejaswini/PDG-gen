import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = 0;
		int b = 0;
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) == '0') a++;
			else b++;
		}
		int max = Math.max(a, b);
		a = 0; b =0;
		int maxa = -1;
		int maxb = -1;
		for(int i = 0 ; i < s.length() - max ; i++) {
			for(int j = i ; j < i + max ; j++) {
				if(s.charAt(j) == '0') a++;
				else b++;
			}
			maxa = Math.max(a, maxa);
			maxb = Math.max(maxb, b);
		}
		int ans = Math.min(maxa, maxb);
		System.out.println(ans);
	}
}
