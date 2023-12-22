import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < M; i++) {
            sum += sc.nextInt();
        }

        System.out.println(sum <= N ? N-sum : -1);
    }
}
