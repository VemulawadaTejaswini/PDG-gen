import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        int[] C = new int[M];
        
        int maxS = 0;

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < M; i++){
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }

        for(int i = 0; i < M; i++){
            int sum = 0;
            for(int k = 0; k < N; k++){
                if(k == B[i])
                    sum += C[i];
                else
                    sum += A[k];
            }
            if(sum > maxS)
                maxS = sum;
        }
        
        System.out.println(maxS);


    }
}