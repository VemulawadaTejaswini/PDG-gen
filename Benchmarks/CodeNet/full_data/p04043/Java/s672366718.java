import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, K;
        int ara[] = new int[10];
        for (int i = 0; i < 10; i++) ara[i] = i;
        N = input.nextInt();
        K = input.nextInt();
        for (int i = 0; i < K; i++) {
            int num = input.nextInt();
            ara[num] = 0;
        }
        Arrays.sort(ara);
        String st = "";
        while (N >= 10) {
            for (int i = K; i < 10; i++) {
                int n = N % 10;
                if (ara[i] >= n) {
                    st = ara[i] + st;
                    break;
                }
            }
            N = N / 10;
        }
        if (ara[K] == 0) K++;
        for (; K < 10; K++) {
            if (ara[K] >= N){
                st = ara[K] + st;
                break;
            }
        }
        System.out.println(st);
    }
}
