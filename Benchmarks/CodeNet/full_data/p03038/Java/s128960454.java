import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		long[] A = new long[N];
 		for(int i = 0;i < N;i++) {
 			A[i] = scn.nextLong();
		}
 		Card[] C = new Card[M];
 		for(int i = 0;i < M;i++) {
 			C[i] = new Card(scn.nextInt(), scn.nextLong());
 		}
 		Arrays.sort(A);
 		Arrays.sort(C);

 		long[] buf = new long[N];
 		int nowS = 0;
 		for(int i = M-1;i >= 0;i--) {
 			Card c = C[i];
 			Arrays.fill(buf, nowS, Math.min(nowS + c.num,N-1),c.C);
 			nowS +=c.num;
 		}
 		Arrays.sort(buf);
 		long ans = 0;
 		int a = N-1, b = N-1;
 		for(int i = 0;i < N;i++) {
 			if(A[a] > buf[b]) {
 				ans += A[a];
 				a--;
 			}else {
 				ans += buf[b];
 				b--;
 			}
 		}
 		System.out.println(ans);
	}

}
class Card implements Comparable<Card>{
	int num;
	long C;

	public Card(int b, long c) {
		this.num = b;
		this.C = c;
	}

	@Override
	public int compareTo(Card o) {
		if(this.C > o.C) {
			return 1;
		}
		if(this.C < o.C) {
			return -1;
		}
		return 0;
	}



}
