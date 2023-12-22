import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        // int P = null;

        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }

        
        double minSum = 1000000000;
        Arrays.sort(X); 

        
        for (int j = X[0]; j <= X[N - 1]; j++) {
            double sum = 0;
            int k = 0;
            for (k = 0; k < N; k++) {
                sum += Math.pow((X[k] - j), 2);
            }

            // sum = Math.pow((X[0] - j), 2) + Math.pow((X[N - 1] - j), 2);
            // System.out.println("j:" + j + " k:" + k + " 合計:" + sum);
            minSum = Math.min(sum, minSum);
        }

        System.out.println((int)minSum);
    }
}