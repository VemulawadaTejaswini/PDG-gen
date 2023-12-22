import java.awt.peer.SystemTrayPeer;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int sy = sc.nextInt()-1;
		int sx = sc.nextInt()-1;
		
		char[][] text = new char[2][];
		text[0] = sc.next().toCharArray();
		text[1] = sc.next().toCharArray();
		
		int[][][] move = new int[2][2][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<2; j++) {
				switch(text[j][i]) {
				case 'U':
					move[0][j][i] = -1;
					break;
				case 'D':
					move[0][j][i] = 1;
					break;
				case 'L':
					move[1][j][i] = -1;
					break;
				case 'R':
					move[1][j][i] = 1;
					break;
				}
			}
		}
		
		if(check(H, sy, move[0][0], move[0][1]) || check(W, sx, move[1][0], move[1][1])) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
		
		sc.close();
	}
	
	static boolean check(int LEN, int p, int[] s, int[] t) {
		int cur = p;
		for(int i=0; i<s.length; i++) {
			if(s[i]==-1) {
				cur--;
				if(cur<0)
					return true;
			}
			if(t[i]==1 && cur<LEN-1)
				cur++;
		}
		cur = p;
		for(int i=0; i<s.length; i++) {
			if(s[i]==1) {
				cur++;
				if(cur>=LEN)
					return true;
			}
			if(t[i]==-1 && cur>0)
				cur--;
		}
		return false;
	}
}
