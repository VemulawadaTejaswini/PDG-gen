import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        new Main().solve();
    }
	ArrayList<Integer>[]path;
    int n,m;
	int[]a;
	int[]b;
	void solve() {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[m];
		b=new int[m];
		path=new ArrayList[n];
		for(int i=0;i<n;i++) {
			path[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt()-1;
			b[i]=sc.nextInt()-1;
			path[a[i]].add(b[i]);
			path[b[i]].add(a[i]);
		}
		int ans=0;
		for(int t=0;t<2;t++) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<path[a[i]].size();j++) {
				for(int k=0;k<path[b[i]].size();k++) {
					int x=path[a[i]].get(j);
					int y=path[b[i]].get(k);
					if(!path[x].contains(y) && x!=y) {
						ans++;
						path[x].add(y);
						path[y].add(x);
						//System.out.println(x+" "+y);
					}
				}
			}
		}
		}
		System.out.println(ans);
	}
}