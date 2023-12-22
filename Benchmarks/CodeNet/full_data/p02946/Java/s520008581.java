import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = Integer.parseInt(sc.next());
    int X = Integer.parseInt(sc.next());
    
    System.out.print(X - K + 1);
    for (int i = X - K + 2; i < X + K; i++) {
      System.out.print(" " + i);
    }
  }
}