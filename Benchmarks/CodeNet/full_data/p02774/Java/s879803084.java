import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        
        long[] A = new long[N];
        long[] product = new long[N*(N-1)/2];
        int count =0;
        for(int i=0;i<N-1;i++) {
            for(int j= i+1; j<N;j++) {
                product[count] = A[i] * A[j];
                count++;
            }
        }
        
        Arrays.parallelSort(product);
        
        System.out.println(product[K-1]);
    }
}
