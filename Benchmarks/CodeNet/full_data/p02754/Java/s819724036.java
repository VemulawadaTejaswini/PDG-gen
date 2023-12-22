import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long count = 0;
        long all = 0;
        while (all < N) {
            for (int i = 0; i < A;i++) {
                count++;
                all++;
                if (all == N) break;
            }
            for (int i = 0; i < B; i++) {
                all++;
                if (all == N) break;
            }
        }
        System.out.println(count);
    }
}