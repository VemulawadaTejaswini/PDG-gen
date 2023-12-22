import java.util.*;
import java.util.Map.Entry;
 
class MyComparator implements Comparator {
    @Override
    public int compare (Object arg0, Object arg1) {
        int x = (int) arg0;
        int y = (int) arg1;

        if (x < y) {
            return 1;
        } else if (x > y) {
            return -1;
        } else{
            return 0;
        }
    }
}

class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int M = sc.nextInt();

       int[] a = new int[(int)N];
       int[] b = new int[(int)N];
       List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
       for(long i=0;i<M+1;i++)list.add(new ArrayList<Integer>());
       for (int i=0 ; i<N; i++) {
           a[i] = sc.nextInt();
           b[i] = sc.nextInt();
           if(a[i]>M)continue;
           list.get(a[i]).add(b[i]);
       }
       
       long cnt=0;
       Queue<Integer> pq = new PriorityQueue<>(new MyComparator ());
       for(int i=1;i<=M;i++) {
           for(int j:list.get(i)) {
        	   pq.add(j);
           }
           if(!pq.isEmpty()) {
        	   cnt=cnt+pq.poll();        	   
           }
       }

       
       System.out.println(cnt);
   }
      

}