import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] L = new int[N + 1];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }
        L[N] = 10000;
        Arrays.sort(L);

        int cnt = 0;
        for (int i=0; i<N-2; i++){
          for (int j=0; j<N-1; j++){
            int sum = L[i] + L[j];

           for (int k=0; k<N; k++){
             if (sum>L[k]){
               cnt++;
             }
           }
         }
       }
       System.out.println(cnt)
    }
}