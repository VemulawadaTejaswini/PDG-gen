import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    
    int max = A + B;
    if (A - B > max) {
      max = A - B;
    }
    if (A * B > max)  {
      max = A * B;
    }
    
    System.out.println(max);
  }
}