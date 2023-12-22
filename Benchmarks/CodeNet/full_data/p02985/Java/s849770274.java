import java.util.*;
import java.util.Map.Entry;
 
 

class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int K = sc.nextInt();

  	   List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
       for(long i=0;i<N;i++)list.add(new ArrayList<Integer>());
       
       int[] a = new int[N];
       int[] b = new int[N];
       for (int i=0 ; i<N-1; i++) {
           a[i] = sc.nextInt()-1;
           b[i] = sc.nextInt()-1;
       	   list.get(a[i]).add(b[i]);
       	   list.get(b[i]).add(a[i]);
       }
       
       long ans=1;
       LinkedList<Integer> queue = new LinkedList<Integer>();
       queue.add(a[0]);
       queue.add(-1);
       queue.add(0);
       while(!queue.isEmpty()) {
    	   int node = queue.poll();
    	   int pre = queue.poll();
    	   int f = queue.poll();
    	   ans=(ans*(K-f))%mod;
    	   int cnt=1;
    	   if(pre==-1)cnt=0;
    	   for(int i:list.get(node)) {
    		   if(i==pre)continue;
    		   cnt++;
    		   queue.add(i);
    		   queue.add(node);
    		   queue.add(cnt);
    	   }
       }


       System.out.println(ans); 	
              		
   }

}