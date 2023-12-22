import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = Long.parseLong(sc.next());
    long B = Long.parseLong(sc.next());
    long K = Long.parseLong(sc.next());

    if (K >= A) {
      System.out.print(0 + " ");
      if (B > K - A) {
        System.out.println(B - (K - A));
      } else {
        System.out.println(0);
      }
    } else {
      System.out.println((A-K) + " " + B);
    }
  }
}