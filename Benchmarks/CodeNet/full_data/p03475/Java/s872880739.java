import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] C = new int[N];
        int[] S = new int[N];
        int[] F = new int[N];

        for(int i=0; i<N-1; i++){
            C[i] = scanner.nextInt();
            S[i] = scanner.nextInt();
            F[i] = scanner.nextInt();
        }

        for(int s=0; s<N; s++){
            if(s == N-1){
                System.out.println(0);
                return;
            }

            int cnt = 0;
            for(int i=s; i<N-1; i++){

                if(cnt < S[i]){
                    cnt = S[i];
                    cnt += C[i];
                }else if(cnt % F[i] == 0){
                    cnt += C[i];
                }else{
                    cnt += F[i] - (cnt % F[i]);
                    cnt += C[i];
                }
            }

            System.out.println(cnt);
        }


    }
}
