import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] coin = new int[100001];
	public static void main(String[] args) {
		maketable();
		int N = sc.nextInt();
		System.out.println(coin[N]);
	}
	static void maketable() {
		int i,k;
		for(i = 0;i <= 100000;i ++) {
			coin[i] = i;
		}
		int s = 6,n = 9;
		while(s <= 100000 || n <= 100000) {
			for(k = s;k <= 100000;k++) {
				if(coin[k] > coin[k-s]+1) coin[k] = coin[k-s] + 1;
			}
			for(k = n;k <= 100000;k++) {
				if(coin[k] > coin[k-n]+1) coin[k] = coin[k-n] + 1;
			}
			s = s * 6; n = n * 9;
		}
	}
}