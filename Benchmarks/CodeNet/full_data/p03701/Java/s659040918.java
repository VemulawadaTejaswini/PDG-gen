import java.util.Arrays;
import java.util.Scanner;
 
    class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
    int N = sc.nextInt();
    int S[] = new int[N];
    int s = 0;
 
    for(int i = 0; i < N; i++) {
    S[i] = sc.nextInt();
    s += S[i];
    }
    
    if(s % 10 != 0) {
        System.out.println(s);
        return;
    }else {
        Arrays.sort(S);
        for(int i = 0; i < N; i++)
              if(S[i] % 10 != 0) {
                      System.out.println(s -= S[i]);
                      return;
              }
         }
        System.out.println(0);
        return ;
  }
}