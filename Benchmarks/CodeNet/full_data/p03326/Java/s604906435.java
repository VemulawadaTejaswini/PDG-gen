import java.util.*;
import static java.lang.System.out;

public class Main{
   public static Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
    int N = sc.nextInt();
    int M = sc.nextInt();
    long array[] = new int[N];
    for (int i = 0; i < A; i++) {
      int sum = 0;
      for (int j = 0; j < 3; j++) {
        sum += sc.nextInt();
      }
      array[i] = sum;
    }
    Arrays.sort(array);

    long result = 0;
    for (int i = N; i > M; i--) {
      if (array[i] > 0){
        ressult += array[i]; 
      }
    }
    printf(result);
   }
}