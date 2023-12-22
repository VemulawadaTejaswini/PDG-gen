import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] arsgs){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int[] snake = new int[n];
    int result = 0;
    for(int i = 0; i < n; i++){
      snake[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(snake);
    
    while(k > 0){
      result += snake[n-1];
      k--;
      n--;
    }
    System.out.println(result);
  }
}