import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   long tmp = 0;
   PriorityQueue pq = new PriorityQueue ();
   for(int i=0;i<N;i++) 
   {
     tmp = sc.nextLong();
     pq.add(tmp);
   }
   for(int i = 0;i<N;i++)
   {
     tmp = pq.poll();
     tmp/=2;
     pq.add(tmp);
   }
   long ans =0;
   for(int i = 0;i<N;i++) ans += pq.poll();
   
   System.out.println(ans);
 }
}