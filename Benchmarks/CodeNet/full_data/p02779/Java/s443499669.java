import java.util.*;

class Main{
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    PriorityQueue pq=new PriorityQueue();
    int N=sc.nextInt();
    
    for(int i=0;i<N;i++){
      pq.add(sc.nextLong());
    }
    
    int count=0;
    
    Long s=(Long)(pq.poll());
    while(!pq.isEmpty()){
      count++;
      Long t=(Long)(pq.poll());
      if(s.equals(t)){
        System.out.print("NO");
        break;
      }
      if(pq.isEmpty()) System.out.print("YES");
      s=t;
    }
  }
}