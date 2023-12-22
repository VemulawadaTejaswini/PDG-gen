import java.util.*;
import java.io.PrintWriter;
public class Main{
	static int[] ans;
	static ArrayList<Integer>[] map;
	static int[] dis;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt()-1;
		int y=sc.nextInt()-1;
		map=new ArrayList[n];
		ans=new int[n+1];
		for(int i=0; i<n; i++){
			map[i]=new ArrayList<>();
		}
		for(int i=0; i<n-1; i++){
			map[i].add(i+1);
			map[i+1].add(i);
		}
		map[x].add(y);
		map[y].add(x);
		for(int i=0; i<n; i++){
			PriorityQueue<St> q=new PriorityQueue<>((t,r)->(t.dis-r.dis));
			dis=new int[n];
			Arrays.fill(dis,-1);
			q.add(new St(0,i));
			while(!q.isEmpty()){
				St p=q.poll();
				if(dis[p.now]!=-1){
					continue;
				}
				dis[p.now]=p.dis;
				if(i<p.now){
					ans[dis[p.now]]++;
				}
				for(int j:map[p.now]){
					if(dis[j]==-1){
						q.add(new St(p.dis+1,j));
					}
				}
			}
		}
		for(int i=1; i<=n-1; i++){
			System.out.println(ans[i]);
		}
	}
	static class St{
		int now,dis;
		St(int dis,int now){
			this.dis=dis;
			this.now=now;
		}
	}
}
