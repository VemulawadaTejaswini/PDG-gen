import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    int total = 0;
    int count = 0;

    int[] S = new int[N];
    
    for(int i = 0; i < N; i++) {
        int token = sc.nextInt();
        S[i] = token;
        total += token;
    }
    
    for(int i = 0; i < N; i++) {
        if(total / (4 * M) < S[i]) count++;
    }
    
    
    if(M == count) {
        System.out.println("Yes");
    }else {
        System.out.println("No");
    }
  }
}
