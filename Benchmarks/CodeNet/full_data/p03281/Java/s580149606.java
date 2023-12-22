import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      int c = 0;
      for (int i = 1; i <= N; i=i+2) {
        int count = 0;
        for (int j = 1; j <= N; j++) {
          if (i % j == 0) count++;
        }
        if (count == 8) c++;
      }
      System.out.println(c);
    }
  }
}
