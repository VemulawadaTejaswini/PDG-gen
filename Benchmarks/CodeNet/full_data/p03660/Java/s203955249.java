import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	int N;
	int[]a;
	int[]b;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		a=new int[N-1];
		b=new int[N-1];
		ArrayList<Integer>[] path=new ArrayList[N];
		int []check=new int[N];
		check[0]=-1;
		check[N-1]=1;
		for(int i=0;i<N;i++){
			path[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<N-1;i++){
			a[i]=sc.nextInt()-1;
			b[i]=sc.nextInt()-1;
			path[a[i]].add(b[i]);
			path[b[i]].add(b[i]);
		}
		
		Queue<Integer> fque=new LinkedList<Integer>();
		Queue<Integer> sque=new LinkedList<Integer>();
		
		fque.add(0);
		sque.add(N-1);
		
		boolean flag=true;
		
		while(flag){
			flag=false;
			int fsize=fque.size();
			for(int i=0;i<fsize;i++){
				int fnow=fque.poll();
				for(int j=0;j<path[fnow].size();j++){
					int d=path[fnow].get(j);
					if(check[d]==0){
						fque.add(d);
						check[d]=-1;
						flag=true;
					}
				}
			}
			if(!flag){
				System.out.println("Snuke");
				break;
			}
			
			flag=false;
			int ssize=sque.size();
			for(int i=0;i<ssize;i++){
				int snow=sque.poll();
				for(int j=0;j<path[snow].size();j++){
					int d=path[snow].get(j);
					if(check[d]==0){
						sque.add(d);
						check[d]=1;
						flag=true;
					}
				}
			}
			if(!flag){
				System.out.println("Fennec");
				break;
			}
		}
		
	}
}
