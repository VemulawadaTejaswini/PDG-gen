import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(solve(N, K));
    }

    public static double solve(int N, int K) {
        double sum = 0;
        double prob = (double)1/N;

        for (int i=1; i<=N; i++) {
            if (i>= K) {
                sum += 1;
                continue;
            }

            sum += Math.pow(0.5, count2(K, i));
        }

        return sum * prob;
   }

   private static int count(int K, int n) {
        int count = (int)Math.ceil((Math.log(K) - Math.log(n)) / Math.log(2.0));
        if (count <= 0) {
            count = 1;
        }

        return count;
   }
   
   private static int count2(int K, int n) {
        for (int i=0;;i++) {
            if (n >= K) return i;
            
            n *= 2;
       }
   }
}