import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
     static int[] weight;
     static int N;
	 static int[] visited;
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(long i=0;i<N*N;i++)list.add(new ArrayList<Integer>());
        int[] first = new int[N];
        
        weight= new int[N*N];
        for(int i=0;i<N;i++) {
            int pre=0;
        	for(int j=0;j<N-1;j++){
        		int a=sc.nextInt();
        		int tmp=Math.min(a, i+1)*N+Math.max(a, i+1)-1;
        		if(pre!=0) {
                	list.get(pre).add(tmp);
        		} else {
        			first[i]=tmp;
        		}
        		pre=tmp;
        	}
        }
        
        for(int i=0;i<first.length;i++) {
//        	if(list.get(first[i]).isEmpty()) {
        		if(weight[first[i]]==0) {
        			visited=new int[N*N];
        			if(dfs(first[i],1)) {
        				System.out.println(-1);
        				return;
        			}
        		}
//        	}
        }

/*		LinkedList<Integer> queue = new LinkedList<Integer>();
		for(int i=0;i<first.length;i++) {
        	if(list.get(first[i]).isEmpty()) {
 //       		if(weight[first[i]]==0) {
        	queue.add(first[i]);
        	queue.add(1);
//        		}
//        	}
        }
    	while(!queue.isEmpty()) {
    		int n = queue.poll();
    		int w = queue.poll();
			if(w>weight[n]) {
				weight[n]=w;
			} else {
				continue;
			}
    		if(w==N*N/2)break;
    		for(int i=0;i<list.get(n).size();i++) {
    			queue.add(list.get(n).get(i));
    			queue.add(w+1);
    		}
    	}*/
        
        int max=0;
        for(int i=0;i<N*N;i++) {
        	max=Math.max(max,weight[i]);
        }
        System.out.println(max);  	

               		
    }

    	static boolean dfs(int now, int cnt) {
    		if(visited[now]>N+1||weight[now]>=N*N/2) {
    			weight[now]=N*N/2;
    			return false;
    		}
    		visited[now]++;
			if(cnt>weight[now]) {
				weight[now]=cnt;
			} else {
				//cnt = weight[now];
				return true;
			}
    		for(int i=0;i<list.get(now).size();i++) {
    			int next = list.get(now).get(i);
    			if(dfs(next, cnt+1))return false;
    		}
    		return true;
    	}
}