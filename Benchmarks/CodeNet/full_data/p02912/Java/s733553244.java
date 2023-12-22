import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   long tmp = 0;
   PriorityQueue pq = new PriorityQueue (N,new MyComparator());
   for(int i=0;i<N;i++) 
   {
     tmp = sc.nextLong();
     pq.add(tmp);
   }
   for(int i = 0;i<N;i++)
   {
     tmp = (long) pq.poll();
     tmp/=2;
     pq.add(tmp);
   }
   long ans =0;
   for(int i = 0;i<N;i++) ans += pq.poll();
   
   System.out.println(ans);
 }
  class MyComparator implements Comparator {
 
    public int compare(Object obj1, Object obj2) {
         
        long num1 = (long)obj1;
        long num2 = (long)obj2;
         
        if(num1 < num2) {
            return 1;
        } else if(num1 > num2) {
            return -1;
        } else{
            return 0;
        }
    }
}
}