/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Main {
  static long G(long x){
    long n = x/4;
    long ret = 0;
    for(long k = 4*n; k<=x; k++){
      ret ^= k; 
    }
    return ret;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong(), B = sc.nextLong();
    System.out.println(G(B) ^ G(A-1));
  }
}
