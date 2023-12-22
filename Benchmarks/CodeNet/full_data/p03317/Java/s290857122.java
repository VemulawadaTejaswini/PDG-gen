import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    int least = scan.nextInt();

    for (int i = 1; i < N; i++) {
      int x = scan.nextInt();
      
      if (x < least) {
        least = x;
        int best = i;
      }
    }
    
    int answer = (best-2)/(K-1) + (N-best-1)/(K-1) + 2;
    
    System.out.println(answer);
  }
}
      