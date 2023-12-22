import java.util.*;
import java.util.Map.Entry;


 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static long[] ans;
	 static boolean[] visit;
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int Q= sc.nextInt();
		List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
        for(long i=0;i<N;i++)list.add(new ArrayList<Integer>());
		int[] a = new int[N];
		int[] b = new int[N];
		for(int i=0;i<N-1;i++){
			a[i]=sc.nextInt()-1;
			b[i]=sc.nextInt()-1;
        	list.get(a[i]).add(b[i]);
        	list.get(b[i]).add(a[i]);
		}
        ans=new long[N];
        visit = new boolean[N];
		for(int i=0;i<Q;i++) {
			ans[sc.nextInt()-1]+=sc.nextInt();
//	        System.out.println("aa");			
		}
		dfs(list,0);
			
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ans.length; i++) {
			if (i == ans.length - 1) {
				sb.append(ans[i]);
			} else {
				sb.append(ans[i]);
				sb.append(" ");
			}
		}
    }
    
	static void dfs(List<ArrayList<Integer>> list, int now) {
		visit[now]=true;
		int next =0;
		for(int nv:list.get(now)) {
			next = nv;
			if(visit[next] == true)continue;
			ans[next] = ans[next]+ ans[now];
			dfs(list,next);
		}
	}

}