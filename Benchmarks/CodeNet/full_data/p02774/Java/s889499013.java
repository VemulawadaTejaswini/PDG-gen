import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N*(N-1)/2];
        
        int dummy = 0;

        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i < N-1; i++){
            for(int j = i + 1; j < N; j++){
                B[count] = A[i]*A[j];
                // System.out.println(B[count]);
                count += 1;
            }
        }

        for (int i = 0; i < count-1; i++){
            for(int j = count-1; j > i; j--){
                if(B[j] < B[j-1]){
                    dummy = B[j];
                    B[j] = B[j-1];
                    B[j-1] = dummy;
                }
            }
        }
        for(int i = 0; i < count; i++){
            // System.out.println(B[i]);
        }

        System.out.println(B[K]);
        sc.close();
    }
}