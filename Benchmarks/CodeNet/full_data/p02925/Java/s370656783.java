import java.util.*;
import java.util.Map.Entry;
 
 

class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	 static int[] weight;
	 static int N;
	 static boolean[] visited;
   public static void main(String[] args) {
   
       Scanner sc = new Scanner(System.in);
       N = sc.nextInt();
       
       for(long i=0;i<N*N;i++)list.add(new ArrayList<Integer>());
       boolean[] firstflg= new boolean[N*N];
       for(int i=0;i<N;i++) {
           int pre=0;
       	for(int j=0;j<N-1;j++){
       		int a=sc.nextInt();
       		int tmp=Math.min(a, i+1)*N+Math.max(a, i+1)-1;
       		if(pre!=0) {
               	list.get(tmp).add(pre);      	
       			firstflg[pre]=true;
       		}
       		pre=tmp;
       	}
       }
       
		int max=0;
       for(int i=1;i<N;i++) {
       	for(int j=i;j<N;j++) {
       		visited=new boolean[N*N];
       		weight= new int[N*N];
//       	if(list.get(first[i]).isEmpty()) {
       			if(firstflg[i*N+j]==false) {
           			int k=dfs(i*N+j);
           			if(k==-1) {
           				System.out.println(-1);
           				return;
           			} else {
           				//System.out.println(k);
           				max=Math.max(max, k);
           			}       				
       			}
       	}
       }

/*		LinkedList<Integer> queue = new LinkedList<Integer>();
		for(int i=0;i<first.length;i++) {
       	if(list.get(first[i]).isEmpty()) {
//       		if(weight[first[i]]==0) {
       	queue.add(first[i]);
       	queue.add(1);
//       		}
//       	}
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
       if(max==0)max=-1;
       System.out.println(max);  	

              		
   }

   	static int dfs(int now) {
   		if(now==-1)return -1;
   		if(visited[now]==true) {
   			if(weight[now]==0) {
   				return -1;
       		} else {
       			return weight[now];
       		}
   		}
   		visited[now]=true;
			int max=1;
   		for(int i=0;i<list.get(now).size();i++) {
   			int pre=dfs(list.get(now).get(i));
   			if(pre==-1)return -1;
   			max=Math.max(max,pre+1);
   		}
   		weight[now]=max;
   		return max;
   	}
}