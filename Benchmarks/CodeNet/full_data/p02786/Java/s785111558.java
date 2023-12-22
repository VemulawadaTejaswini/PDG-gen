import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long o=0;
        long h=sc.nextLong();
        long c=1;
        while(h>=1){
            o+=c;
            c*=2;
            h/=2;
        }
       //PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
      
      
      System.out.println(o);
    }
}