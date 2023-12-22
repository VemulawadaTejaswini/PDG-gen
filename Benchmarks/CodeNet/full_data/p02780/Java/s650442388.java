import java.util.*;

public class Main {
    // AtCoder Beginner Contest 154
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N = 0;
        double K = 0;
        String[] num = scanner.nextLine().split(" ");
        N = Double.parseDouble(num[0]);
        K = Double.parseDouble(num[1]);
        String[] p = scanner.nextLine().split(" ");
        Double[] index = new Double[(int) N];
        double maxExpected = 0;
        double val = 0;
        for(int x = 0; x<N; x++){
            val = Double.parseDouble(p[x]);
            index[x] = val*(val+1)/2 * 1/val;

        }
        double sum = 0;
        for(int x=0; x<=N-K; x++){
            for(int y = x; y<x+K; y++){
                sum = sum + index[y];
            }
            maxExpected = Math.max(maxExpected, sum);
            sum = 0;
        }

    System.out.println(maxExpected);

    }





}
