import java.util.*;

public class Main {
 public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] array = new int[n];
  for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
  }
  for (int i = 0; i < n; i++) {
     for (int j = i + 1; j < n; j++) {
         if(array[i] * array[j] % 4 == 0) {
            System.out.println("Yes");
            return;
         }
     }
  }
  System.out.println("No");
 }
}