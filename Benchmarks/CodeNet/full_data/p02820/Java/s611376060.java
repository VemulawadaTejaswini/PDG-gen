
import java.util.Scanner;
public class Main {
	
	static int r;
	static int s;
	static int p;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		 r = Integer.parseInt(sc.next()); // グー
		 s = Integer.parseInt(sc.next()); //チョキ
		 p = Integer.parseInt(sc.next()); //パー
		
		char []hand = sc.next().toCharArray();
		int [][]cnt = new int [k][3];
		int [][]len = new int[k][3];
		for(int i = 0 ; i < n ; i++) {
			cnt[i%k][jdg(hand[i])]++;
			
			if(i - k >= 0 && hand[i] == hand[i-k]) {
			len[i%k][jdg(hand[i])]++;
			}
		}
		
		long ans = 0;
		
		for(int i = 0 ; i < k ; i++) {
			ans += p * (cnt[i][0] - dec(len[i][0]));
			ans += r * (cnt[i][1] - dec(len[i][1]));
			ans += s * (cnt[i][2] - dec(len[i][2]));
			
		}
		
		System.out.println(ans);
				}
	
	static int jdg(char k) {
		if(k == 'r') {
			return 0;
		}
		if(k == 's') {
			return 1;
		}
			return 2;
	}
		

	static int dec(int len) {
		if(len % 2 == 0) {
			return len/2;
		}
		else {
			return (len+1)/2;
		}
	}

}
