import java.io.*;
import java.util.*;

public class Main {
  public static void main(String... args) {
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));

    try {
      int n = Integer.parseInt(br.readLine());
      String[] arrayB = br.readLine().split(" ");
      int nowB = 0;
      int postB = 0;
      int result = 0;
      
      for(int i = 0; i < n - 1; i++) {
        nowB = Integer.parseInt(arrayB[i]);
        if (i == 0) {
          result += nowB;
        } else {
          result += Math.min(postB, nowB);
        }
        if (i < n - 2) {
          postB = nowB;
        } else {
          result += nowB;
        }
      }

      System.out.println(result);
      br.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}