import java.util.Scanner;

public class Main{
	static int N;
	static int t1=0, x1=0, y1=0;
	static boolean dfs(int x, int y, int time) {
		if(time==t1) {
			if(x==x1 && y==y1) {
				return true;
			}
			else {
				return false;
			}
		}
		if(time>t1) {
			if(x>=1) {
				dfs(x-1, y, time-1);
			}//左に戻る
			dfs(x+1, y, time-1);//右に戻る
			if(y>=1) {
				dfs(x, y-1, time-1);
			}//上に戻る
			dfs(x, y+1, time-1);//下に戻る
		}
		return dfs(x-1, y, time-1)||dfs(x+1, y, time-1)||dfs(x, y-1, time-1)||dfs(x, y+1, time-1);
	}
    public  static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		N=sc.nextInt();
    		int t, x, y, sum=0;
    		for(int i=0; i<N; i++) {
    			t=sc.nextInt();
    			x=sc.nextInt();
    			y=sc.nextInt();
    			if(dfs(x, y, t)) {
    				t1=t;	x1=x;	y1=y;
    			}
    			else {
    				sum=-1;
    				break;
    			}
    		}
    		if(sum==-1) {
    			System.out.println("No");
    		}
    		else {
    			System.out.println("Yes");
    		}
    	}
    }
}