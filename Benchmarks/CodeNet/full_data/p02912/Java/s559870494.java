import java.util.*;
import java.util.stream.*; 

public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      int ticket = scanner.nextInt();
      
      Integer[] prices = new Integer[num];
     
      for (int i = 0; i < num; i++) {
      	prices[i] = scanner.nextInt();
      }
      Arrays.sort(prices, Collections.reverseOrder());
      
      while (ticket > 0) {
        prices[0] = prices[0] / 2;
        SwapInOrder(prices);
      	ticket--;
      }
      
      //int sum = 0;
      //for (i = 0; i < prices.length; i++) 
      //	sum +=  prices[i];
      //return sum;
      
      System.out.println(Arrays.stream(prices).mapToInt(Integer::intValue).sum());
    }
  	
  	public static void SwapInOrder(Integer[] prices) {
      int i = 0;
      while (i < prices.length - 1) {
      	if (prices[0] > prices[i + 1]) {
          break;
        }
        i++;
      }
      
      if (i > 0) {
        int temp = prices[0];
        prices[0] = prices[i];
        prices[i] = temp;
      }
    }
}
