import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        int M;
        int[] Ai;
        int sum = 0;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            M = sc.nextInt();
            Ai = new int[M];
            for (int i = 0; i < M; i++) {
                sum +=  sc.nextInt();
            }
        }
        if(sum <= N){
            System.out.println(N -sum);
        }else{
            System.out.println(-1);
        }
    }
}
