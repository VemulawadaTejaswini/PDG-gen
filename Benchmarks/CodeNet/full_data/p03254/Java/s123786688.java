import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      int x = sc.nextInt();
      int[] arr = new int[N];
      for (int i = 0; i < N; i++) {
        arr[i] = sc.nextInt();
      }
      Arrays.sort(arr);
      int count = 0;
      for (int i = 0; i < N; i++) {
        if (x - arr[i] >= 0) {
          count++;
          x -= arr[i];
        }
      }
      if (x > 0) {
         count--;
      }
      if (count < 0) count = 0;
      System.out.println(count);
    }
  }
}
