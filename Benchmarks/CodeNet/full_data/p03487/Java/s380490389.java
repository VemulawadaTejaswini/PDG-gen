import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.next());
    
    int count[] = new int[N];
    boolean flag[] = new boolean[N];
    for (int i = 0; i < N; i++) {
      count[i] = i + 1;
      flag[i] = false;
    }
    
    int sumElement = 0;
    
    for (int i = 0; i < N; i++) {
      int ai = Integer.parseInt(sc.next());
      if (ai < N && !flag[ai - 1]) {
        count[ai - 1]--;
        if (count[ai - 1] == 0) {
          flag[ai - 1] = true;
          sumElement += ai;
        }
      }
    }
    System.out.println(N - sumElement);
    
  }
}