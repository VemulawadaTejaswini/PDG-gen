import java.util.*;

public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      int ticket = scanner.nextInt();
      
      PriorityQueue<Integer> prices 
        = new PriorityQueue<Integer>(Collections.reverseOrder());
     
      for (int i = 0; i < num; i++) {
        prices.offer(scanner.nextInt());
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
