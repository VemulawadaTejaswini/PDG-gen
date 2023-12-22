import java.util.Scanner;
import java.util.ArrayList;
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
    
    Collections.sort(H);
    
    long A = 0;
    for (int i = 0; i < N; i++) {
      if (N - i > K) {
        A += H.get(i);
      }
    }
    
    System.out.println(A);
    
  }
}