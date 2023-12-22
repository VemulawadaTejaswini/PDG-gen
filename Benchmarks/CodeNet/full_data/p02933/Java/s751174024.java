import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    
    if (a > 3200) {
      System.out.println(sc.next());
    } else {
      System.out.println("red");
    }
  }
}