import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] numbers = new int[N];
    int place1 = 0;
    for (int i = 0; i < N; i++) {
      numbers[i] = sc.nextInt();
      if (numbers[i] == 1) place1 = i;
    }
    int right = (N - 1) - place1;
    int left = place1;
    if (right + left < K || K == N) {
      System.out.println(1);
    } else if (left < (K - 1)) {
      right -= (K - 1) - left;
      if (right % (K - 1) != 0) {
        System.out.println(right / (K - 1) + 2);
      } else {
        System.out.println(right / (K - 1) + 1);
      }
    } else if (right < (K - 1)) {
        left -= (K - 1) - right;
        if (left % (K - 1) != 0) {
          System.out.println(left / (K - 1) + 2);
        } else {
          System.out.println(left / (K - 1) + 1);
        }
    } else {
          int count = 0;
          if (left % (K - 1) != 0) {
            count += left / (K - 1) + 1;
          } else {
            count += left / (K - 1);
          }
          if (right % (K - 1) != 0) {
            count += right / (K - 1) + 1;
          } else {
            count += right / (K - 1);
          }
          System.out.println(count);
        
      
      
    }
    
    
  }
}