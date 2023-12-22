import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_n, i, j, count = 0;
    number_n = Integer.parseInt(sc.next());
    int[] height = new int[number_n];
    for(i = 0; i < number_n; i++) {
      height[i] = Integer.parseInt(sc.next());
      for(j = 0; j < i; j++) {
        if(height[j] > height[i]) {
          break;
        }
      }
      if(j == i) count++;
    }
    System.out.println(count);
  }
}
