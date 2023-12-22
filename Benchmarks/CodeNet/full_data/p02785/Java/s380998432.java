import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    ArrayList<Integer> H = new ArrayList<>();
    
    for (int i = 0; i < N; i++) {
    H.add(sc.nextInt());
    }
    
    Collections.sort(H, Comparator.reverseOrder());
    
    if (N <= K) {
      K = N;
    }
    for (int i = 0; i < K; i++) {
    H.remove(0);
    }
    
    long attack = 0;
    for (int h : H) {
      attack += h;
    }
    
    System.out.println(attack);
    
  }
}