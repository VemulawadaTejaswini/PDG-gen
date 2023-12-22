import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
		static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		static int[] a_d3;
		static int maxd=0;
		static boolean[] visited;
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        a_d3=new int[N];
	        int ai,bi;
	        for(long i=0;i<N;i++)list.add(new ArrayList<Integer>());
	        for(long i=0;i<N-1;i++) {
	        	ai = sc.nextInt()-1;
	        	bi = sc.nextInt()-1;
	        	list.get(ai).add(bi);
	        	list.get(bi).add(ai);
	        }
	        visited=new boolean[N];
	        for(int i=0;i<N;i++) {
	        	if(visited[i]==false) {
	        		dfs(i,0,-1,i);
	        	}      	
	        }
	        
	        int[] ans=new int[N];
	        int k=1;
	        int l=1;
	        boolean[] siyo=new boolean[N+1];
	        for(int i=0;i<N;i++) {
	        	if(a_d3[i]==-100) {
	        		ans[i]=3*k;
	        		if(3*k>N) {
	        			System.out.println(-1);
	        			return;
	        			}
	        		siyo[3*k]=true;
	        		k++;
	        	} else if(a_d3[i]!=0){
	        		ans[i]=l;
	        		ans[a_d3[i]]=l+1;
	        		if(l+1>N) {
	        			System.out.println(-1);
	        			return;
	        		}
	        		siyo[l]=true;
	        		siyo[l+1]=true;
	        		l=l+3;
	        	}
	        }
	        
	        int b=1;
	        for(int i=0;i<N;i++) {
	        	if(ans[i]==0) {
	        		while(siyo[b]==true) {
	        			b++;
	        		}
	        		ans[i]=b;
	        		siyo[b]=true;
	        	}
	        }
	        StringBuffer sf=new StringBuffer();
	        for(int i=0;i<N;i++) {
	        	sf.append(ans[i]);	        	
	        	sf.append("\n");	        	
	        }
	        System.out.println(sf);
	 }
	 
		static void dfs(int now, int cnt, int parent,int moto) {
		maxd=Math.max(maxd, cnt);
		for(int i=0;i<list.get(now).size();i++) {
			int next = list.get(now).get(i);
			if(next == parent)continue;
			else if(cnt==2) {
					if(a_d3[moto]==0) {
						a_d3[moto]=next;
						visited[next]=true;
					} else {
						a_d3[moto]=-100;
						visited[next]=true;
					}					
			} else {
				dfs(next, cnt+1, now,moto);				
			}
		}
	}
}