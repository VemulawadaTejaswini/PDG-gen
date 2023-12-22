import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (a + b == 15) {
        System.out.println("+");
      } else if (a * b == 15) {
        System.out.println("*");
      } else {
        System.out.println("x");
      }
    }
  }
}
