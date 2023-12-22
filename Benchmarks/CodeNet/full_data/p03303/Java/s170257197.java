import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      String s = sc.next();
      int w = sc.nextInt();
      String tokens = s.split("");
      for (int i = 0; i < max; i *= w) {
        System.out.print(tokens[i]);
      }
      System.out.println();
    }
  }
}