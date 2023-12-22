import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    
    int count = 0;
    for (int i = 0; i < N; i++) {
      if (Integer.parseInt(sc.next()) >= K) {
        count++;
      }
    }
    
    System.out.println(count);
  }
}