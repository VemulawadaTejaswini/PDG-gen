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
    		pre[y] = pre[x];
    		dis[y] += d + dis[x];
    	}
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			dis = new int[100005];
			pre = new int[100005];
			
			int n = scanner.nextInt();
			int m = scanner.nextInt(); 
			boolean ans = true;
			for(int i=0;i<n;i++) pre[i] = i;
			for(int i=0;i<m;i++) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				int d = scanner.nextInt();
				if(pre[x]!=pre[y]) {
					Merge(x,y,d);
				}else {
					if(dis[y]!=d) ans = false;
				}
			}
			if(ans) System.out.println("Yes");
			else System.out.println("No");
		}
		
	}

}
