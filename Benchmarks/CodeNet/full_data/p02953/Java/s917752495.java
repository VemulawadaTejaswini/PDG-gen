import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    int[] H = new int[N];

    for (int i = 0; i < N; i++) {
      H[i] = sc.nextInt();
    }

    sc.close();

    for (int i = N-2; 0 <= i; i--) {

      if (H[i] > H[i+1]) {
        if (H[i] - H[i+1] == 1) {
          H[i]--;
        } else {
          System.out.println("No");
          return;
        }
      }
    }

    System.out.println("Yes");
    
  }

}