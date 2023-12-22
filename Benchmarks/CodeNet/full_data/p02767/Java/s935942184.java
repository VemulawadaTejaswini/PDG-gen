import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }
        Arrays.sort(X);
        int min = Integer.MAX_VALUE;
        for (int P = X[0]; P <= X[X.length - 1] ; P++) {
            int sum = 0;
            for(int x: X){
                sum += Math.abs(x - P) * Math.abs(x - P);
            }
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}