import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Main
 */
public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N+10];
        long[] B = new long[N*(N-1)/2];
        // List<Long> B = new ArrayList<Long>();
        
        int dummy = 0;

        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i <= N-2; i++){
            for(int j = i + 1; j <= N-1; j++){
                // B.add(A[i]*A[j]);
                B[count] = A[i]*A[j];
                System.out.println(B[count]);
                count += 1;
            }
        }

        // Collection.sort(B);

        Arrays.sort(B);


        System.out.println(B[K-1]);
        sc.close();
    }
}