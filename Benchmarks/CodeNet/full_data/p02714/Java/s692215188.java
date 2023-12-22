import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        String S = sc.next();
        int ng = 0;
        int R = 0;
        int G = 0;
        int B = 0;
        for(int i = 0; i < N; i++){
          if(S.charAt(i) == 'R'){
            R++;
          }else if(S.charAt(i) == 'G'){
            G++;
          }else if(S.charAt(i) == 'B'){
            B++;
          }
        }
        int ans = R*G*B;
        for (int i = 0; i < N - 2; i++) {
          for (int j = i + 1; j < N - 1; j++) {
            int k = 2*j-i;
            if (k >= N) {
                continue;
            }
            if (S.charAt(i) != S.charAt(j) && S.charAt(i) != S.charAt(k) && S.charAt(j) != S.charAt(k)) {
                ans--;
            }
          }
        }
        System.out.println(ans);
      }
}
