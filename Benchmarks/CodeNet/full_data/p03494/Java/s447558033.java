import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < n; i++) {
      int num = sc.nextInt();
      min = Math.min(min, count(num));
    }
    System.out.println(min);
  }
  public static int count(int num) {
    int count = 0;
    while(num % 2 == 0) {
      count++;
      num /= 2;
    }
    return count;
  }
}
