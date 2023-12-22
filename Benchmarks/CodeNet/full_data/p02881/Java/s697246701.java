import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    Queue<Long> pq = new PriorityQueue<Long> (Collections.reverseOrder());
    for(int i=1;i<(int)Math.floor(Math.sqrt(N));i++){
      if(N%i==0){
        pq.add((long)i);
      }
    }
    long dmax = pq.poll();
    long dmaxb = N/dmax;
    System.out.println(dmax+dmaxb-2);
      
  }
  

  
}