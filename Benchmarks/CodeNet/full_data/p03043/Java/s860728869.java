import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        double sum = 0;
        int start = 1;
        while(start <= N){
            int n = start;
            double count = 0;
            while(n < K) {
                n *= 2;
                count++;
            }
            sum += 1 / Math.pow(2, count);
            start++;
        }

        System.out.println(sum/N);
    }
}