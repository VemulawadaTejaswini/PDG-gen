import java.util.*;

public class Main {
    static int[] dis,pre;
    
    static int  find(int x) {
    	while(x!=pre[x]) {
    		int r = pre[x];
    		dis[x] += dis[r];
    		x = r;
    	}
    	return x;
    }
    
    static void Merge(int x,int y,int d) {
    	int fx = find(x);
    	int fy = find(y);
    	if(fx != fy) {
    		pre[fy] = pre[fx];
    		dis[fy] = dis[x] + d - dis[y];
    	}
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		dis = new int[100005];
		pre = new int[100005];
		
		int n = scanner.nextInt();
		int m = scanner.nextInt(); 
		boolean ans = true;
		for(int i=1;i<=n;i++) pre[i] = i;
		for(int i=0;i<m;i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int d = scanner.nextInt();
//			System.out.println("x="+x+"  y="+y);
//			System.out.println("pre[x]="+pre[x]+"  pre[y]="+pre[y]);
			if(pre[x]!=pre[y]) {
				Merge(x,y,d);
			}else {
				if(dis[y]!=d) {ans = false; break;}
			}
		}
//		for(int i=1;i<=n;i++) System.out.println("dis["+i+"]="+dis[i]);
		if(ans) System.out.println("Yes");
		else System.out.println("No");
		
	}

}