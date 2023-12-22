import java.util.*;
//080D
public class Main {
	public static void main(String[] args) {
		//同じチャンネルは連続でとれる。
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), C = sc.nextInt();
		int sec = (int)1e5;
		Integer overlap[] = new Integer[sec];
		Arrays.fill(overlap,0);
		int chan[][] = new int[C][sec];
		for(int i=0;i<N;i++) {
			int s = sc.nextInt(), t = sc.nextInt(), c = sc.nextInt()-1;
			for(int j=s;j<=t-1;j++) {
				chan[c][j]++;
			}
		}	
		for(int i=0;i<C;i++) {
			for(int j=1;j<sec;j++) {
				if(chan[i][j-1]==0&&chan[i][j]==1) overlap[j-1]++;
				else if(chan[i][j]==1) overlap[j]++;
			}
			
		}
		
		Arrays.sort(overlap,Comparator.reverseOrder());
		int ans = overlap[0];
		System.out.println(ans);
	}
}
