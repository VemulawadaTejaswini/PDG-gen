import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int maxGcd = 1;
        for (int d=2; d<P/2+1; d++) {
            int times = 0;
            while (P % d == 0) {
                P /= d;
                times++;
            }
            if (times >= N) {
                maxGcd *= Math.pow(d, times/N);
            }
            if (P == 1) { break; }
        }
        System.out.println(maxGcd);
    }
}
