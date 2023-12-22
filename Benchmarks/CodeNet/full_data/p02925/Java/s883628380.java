import java.util.*;
import java.util.Map.Entry;
 
 

class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	 static List<ArrayList<Integer>>  list2 = new ArrayList<ArrayList<Integer>>();
	 static int[] weight;
	 static int N;
	 static boolean[] visited;
   public static void main(String[] args) {
   
       Scanner sc = new Scanner(System.in);
       N = sc.nextInt();
       boolean[] visited2 = new boolean[N*N];
       int[] first = new int[N];
       for(long i=0;i<N*N;i++)list.add(new ArrayList<Integer>());
       for(long i=0;i<N*N;i++)list2.add(new ArrayList<Integer>());
       for(int i=0;i<N;i++) {
           int pre=0;
       	for(int j=0;j<N-1;j++){
       		int a=sc.nextInt();
       		int tmp=Math.min(a-1, i)*N+Math.max(a-1, i);
       		if(pre!=0) {
               	list.get(pre).add(tmp);      	
               	list2.get(tmp).add(pre);
               	visited2[tmp]=true;
       		} else {
           		first[i]=tmp;
       		}
       		pre=tmp;
       	}
       }
       Arrays.sort(first);
		int max=0;
		/*       for(int i=1;i<N;i++) {
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
*/
		LinkedList<Integer> queue = new LinkedList<Integer>();
	    int[] tcnt= new int[N*N];
	    weight=new int[N*N];
		int p=-1;
		for(int i=0;i<first.length;i++) {
//       	if(list.get(first[i]).isEmpty()) {
//       		if(weight[first[i]]==0) {
			if(p!=first[i]&&visited2[first[i]]==false) {
		       	queue.add(first[i]);
		       	queue.add(1);				
			}
			p=first[i];
//       		}
//       	}
       }
		boolean[] visited = new boolean[N*N];
   	while(!queue.isEmpty()) {
   		int n = queue.poll();
   		int w = queue.poll();
   		tcnt[n]++;
   		if(visited[n]) {
   			System.out.println(-1);
   			return;
   		}
		if(weight[n]<w)weight[n]=w;
		if(tcnt[n]<list2.get(n).size())continue;
 //  		if(w==N*N/2)break;
   		for(int i=0;i<list.get(n).size();i++) {
   			queue.add(list.get(n).get(i));
   			queue.add(w+1);
   			max=Math.max(max, w+1);
   		}
   		visited[n]=true;
   	}
   	
   	for(int i=0;i<N*N;i++) {
   		if(tcnt[i]<list2.get(i).size())max=-1;
   	}
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