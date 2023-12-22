import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = Integer.parseInt(sc.next());
        int L = Integer.parseInt(sc.next());

        int temp = 10000;
        int temp2 = 10000;
        for (int i = 0; i < N; i++) {
            if (temp > Math.abs(L + i)) {
                temp = Math.abs(L + i);
                temp2 = (L + i);
            }
        }
        System.out.println((int)(L * N + (N / 2) * (N - 1)) - temp2);
        sc.close();
    }
}
