import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] v = new int[N];
    for (int i = 0; i < N; i++) {
      v[i] = Integer.parseInt(sc.next());
    }
    
    Arrays.sort(v);
    
    double sum = v[0];
    for (int i = 1; i < N; i++) {
      sum = (sum + v[i]) / 2.0;
    }
    
    System.out.println(sum);
  }
}