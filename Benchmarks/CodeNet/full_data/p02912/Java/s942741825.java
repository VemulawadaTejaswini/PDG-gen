import java.util.*;

public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = Integer.parseInt(sc.next());
      int ticket = Integer.parseInt(sc.next());
      
      PriorityQueue<Integer> prices 
        = new PriorityQueue<Integer>(Collections.reverseOrder());
     
      for (int i = 0; i < num; i++) {
        prices.offer(Integer.parseInt(sc.next()));
      }
      
      while (ticket > 0) {
        prices.offer(prices.poll() / 2);
      	ticket--;
      }
      
      int sum = 0;
       for (int i: prices) {
         sum += i;
      }
      System.out.println(sum);
    }
}
