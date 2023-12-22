import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.valueOf(sc.next());
    int b = Integer.valueOf(sc.next());

    if (a < b) {
        for (int i = 0; i < b; i++) {
            System.out.print(a);
        }
        System.out.println();
      } else {
        for (int i = 0; i < a; i++) {
            System.out.print(b);
        }
        System.out.println();
      }
  }
}