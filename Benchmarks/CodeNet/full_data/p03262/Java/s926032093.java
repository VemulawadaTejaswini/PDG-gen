import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      int X = sc.nextInt();
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < N; i++) {
        int tmp = Math.abs(X - sc.nextInt());
        if (tmp < min) {
          min = tmp;
        }
      }
      System.out.println(min);
    }
  }
}
