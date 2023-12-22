import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++){
          A[i] = input.nextInt();
        }
        int ans = 0;
        boolean flag = false;
        while (true){
          if (flag){
            break;
          }
          for (int i = 0; i < N; i++){
            if (A[i]%2 != 0){
              flag = true;
              break;
            }
            if (i == N-1){
              ans += 1;
            }
            A[i] /= 2;
          }
        }
        System.out.println(ans);
    }
}