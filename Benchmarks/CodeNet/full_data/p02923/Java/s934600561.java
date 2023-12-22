import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] H = new int[N];
    
    for (int i = 0; i < N; i++) {
      H[i] = Integer.parseInt(sc.next());
    }
    
    int max = 0;
    int count = 0;
    for (int i = 1; i < N; i++) {
      if (H[i-1] - H[i] >= 0) {
        count++;
      } else {
        if (count > max) {
          max = count;
        }
        count = 0;
      }
    }
    if (count > max) {
      max = count;
    }
    
    System.out.println(max);
  }
}