import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int M = sc.nextInt();
//       String S = sc.next();
//       char[] c = S.toCharArray();
       
       Integer[][] a = new Integer[M][2];
       List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
       for(long i=0;i<N;i++)list.add(new ArrayList<Integer>());
       for (int i=0 ; i<M; i++) {
    	   int ai= sc.nextInt()-1;
    	   int bi= sc.nextInt()-1;
    	   int c= sc.nextInt()-1;
    	   list.get(ai).add(bi);
    	   list.get(bi).add(ai);
       }
       long cnt=0;
       boolean[] m=new boolean[N];
       LinkedList<Integer> queue = new LinkedList<Integer>();
       for(int i=0;i<N;i++) {
    	   if(m[i]==false) {
    		  cnt++;
    		  queue.add(i);
    		  while(!queue.isEmpty()) {
    			  int node=queue.poll();
        		  m[node]=true;
    			  for(int j:list.get(node)) {
    				  if(m[j]==true)continue;
    	    		  queue.add(j);    				  
    			  }
    		  }
    	   }
       }
       
       
       System.out.println(cnt);
   }
      

}