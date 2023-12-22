import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int C = Integer.parseInt(sc.next());
    
    int ans = C - (A - B);
    if (ans > 0) {
      System.out.println(C - (A - B));
    } else {
      System.out.println(0);
    }
  }
}