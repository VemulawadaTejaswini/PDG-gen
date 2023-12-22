import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s[] = new int[n];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}
		Arrays.sort(s);
		for (int i = 0; i < n - 2; i++) {
			for (int o = i + 1; o < n - 1; o++) {
				// s[i]+s[o]
				for (int p = o + 1; p < n; p++) {
					if ((s[i] + s[o] > s[p])
							&& (Math.abs(s[i] - s[o]) < s[p])) {
						//System.out.println(s[i]+" "+s[o]+" "+s[p]);
						ans++;
					}
					if(Math.abs(s[i] - s[o]) < s[p]){
						break;
					}
				}

			}

		}
	System.out.println(ans);
	}
}