import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		List<Integer> xmv = new ArrayList<Integer>();
		List<Integer> ymv = new ArrayList<Integer>();
		
		int cnt = 0;
		boolean goX = true;
		for(int i=0;i<s.length()+1;i++) {
			if(i!=s.length()&&s.charAt(i)=='F')cnt++;
			else {
				if(goX) {
					xmv.add(cnt);
					goX = false;
				}else {
					ymv.add(cnt);
					goX = true;
				}
				cnt = 0;
			}
		}
		
		int xmax = 0;
		for(int i=0;i<xmv.size();i++)xmax+=xmv.get(i);
		
		//xについて
		boolean dp[][] = new boolean[8080][16050];
		dp[0][xmv.get(0)+8000]=true;
		for(int i=1;i<xmv.size();i++) {
			int dist = xmv.get(i);
			for(int j=-xmax;j<=xmax;j++) {
				dp[i][j+8000] = dp[i-1][j-dist+8000]||dp[i-1][j+dist+8000];
			}
		}
		
		//yについてコピー
		int ymax = 0;
		for(int i=0;i<ymv.size();i++)ymax+=ymv.get(i);
		
		//xについて
		boolean dpy[][] = new boolean[8080][16050];
		if(ymv.size()==0)ymv.add(0);
		dpy[0][ymv.get(0)+8000]=true;
		for(int i=1;i<ymv.size();i++) {
			int dist = ymv.get(i);
			for(int j=-ymax;j<=ymax;j++) {
				dpy[i][j+8000] = dpy[i-1][j-dist+8000]||dpy[i-1][j+dist+8000];
			}
		}
		
		String ans = "No";
		if(dp[xmv.size()-1][x+8000]&&dpy[ymv.size()-1][y+8000]) ans = "Yes";
		System.out.println(ans);
		
	}
}
