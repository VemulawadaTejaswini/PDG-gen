import java.util.*;
import java.util.Map.Entry;
 
 

class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int M = sc.nextInt();

  	   List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
       for(long i=0;i<M*3+1;i++)list.add(new ArrayList<Integer>());
       
       int[] u = new int[M];
       int[] v = new int[M];
       for (int i=0 ; i<M; i++) {
           u[i] = sc.nextInt()-1;
           v[i] = sc.nextInt()-1;
       	   list.get(u[i]*3).add(v[i]*3+1);
       	   list.get(u[i]*3+1).add(v[i]*3+2);
       	   list.get(u[i]*3+2).add(v[i]*3);
       }
       int S = sc.nextInt()-1;
       int T = sc.nextInt()-1;
       
       
       LinkedList<Integer> queue = new LinkedList<Integer>();
       boolean[] visited = new boolean[3*N];
       int[] w = new int[3*N];
	   queue.add(S*3);
	   queue.add(0);
       while(!queue.isEmpty()) {
    	   int node = queue.poll();
    	   int wight = queue.poll();
    	   w[node]=wight;
    	   if(visited[node])continue;
    	   visited[node]=true;
    	   for(int i:list.get(node)) {
    		   queue.add(i);
    		   queue.add(wight+1);
    	   }
       }
       
       int ans = w[T*3]/3;
       if(ans==0)ans=-1;
       System.out.println(ans); 	
              		
   }

}