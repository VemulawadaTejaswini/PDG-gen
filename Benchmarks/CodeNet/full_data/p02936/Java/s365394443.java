import java.util.*;
import java.util.Map.Entry;


 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
	 static long[] ans;
	 static boolean[] visit;
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int Q= sc.nextInt();
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
		dfs(0);
			
		for(int i=0;i<N;i++) {
	        System.out.println(ans[i]);			
	    }
    }
    
	static void dfs(int now) {
		visit[now]=true;
		long xi =+ ans[now];
		for(int i=0;i<list.get(now).size();i++) {
			int next = list.get(now).get(i);
			if(visit[next] == true)continue;
			ans[next] = ans[next]+ xi;
			dfs(next);
		}
	}

}