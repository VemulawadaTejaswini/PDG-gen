import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		int[] cnt = new int[26];
		for(int i=0; i<H; i++) {
			char[] c = sc.next().toCharArray();
			for(int j=0; j<W; j++) {
				cnt[c[j]-'a']++;
			}
		}
		
		int[] mod = new int[3];
		for(int i=0; i<26; i++) {
			for(int j=2; j>=0; j--) {
				mod[j] += cnt[i]/(1<<j);
				cnt[i] %= (1<<j);
			}
		}
		
		System.out.println(check(H, W, mod) ? "Yes" : "No");
		
		sc.close();
	}
	
	static boolean check(int H, int W, int[] mod) {
		int[] need = new int[3];
		need[2] = (H/2)*(W/2);
		need[1] = (H%2)*(W/2) + (W%2)*(H/2);
		need[0] = (H%2)*(W%2);
		for(int i=2; i>=0; i--) {
			if(mod[i]<need[i])
				return false;
			if(i>0)
				mod[i-1] += (mod[i]-need[i])*2;
		}
		return true;
	}
}