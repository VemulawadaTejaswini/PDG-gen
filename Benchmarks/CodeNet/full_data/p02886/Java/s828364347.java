import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] list = new int[N];
            int ans = 0;
            for(int i = 0; i < N; i++){
              list[i] = sc.nextInt();
            }
            for(int i = 0; i < N; i++){
              for(int j = i + 1; j < N; j++){
                ans += list[i] * list[j];
              }
            }
            System.out.println(ans);
          }
}