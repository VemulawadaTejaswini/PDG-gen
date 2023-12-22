import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(solve(N));
    }

    private static long solve(int N) {
        long count = 0;

        for (int i=1; i<=N; i++) {
            if (i%10 == 0) continue;
            if (i<10) {
                count += 1;
            } else if (i < 100) {
                if (i/10 == i%10) count += 3;
                else if (10 * (i%10) < i) {
                    count += 2;
                }
            } else if (i < 1000){
                if (i/100 == i%10) {
                    count += 1 + 1*2 + 1*2;
                    count += ((i%100)/10)*2;
                } else {
                    count += 1*2;
                    if (100*(i%10) < i) {
                        count += 10*2;
                    }
                }
            } else if (i < 10000) {
                if (i/1000 == i%10) {
                    count += 1 + 1*2 + 1*2 + 10*2;
                    count += ((i%1000)/10)*2;
                } else {
                    count += 1*2 + 10*2;
                    if (1000*(i%10) < i) {
                        count += 100*2;
                    }
                }
            } else if (i < 100000){
                if (i/10000 == i%10) {
                    count += 1 + 1*2 + 1*2 + 10*2 + 100*2;
                    count += ((i%10000)/10)*2;
                } else {
                    count += 1*2 + 10*2 + 100*2;
                    if (10000*(i%10) < i) {
                        count += 1000*2;
                    }
                }
            } else {
                if (i/100000 == i%10) {
                    count += 1 + 1*2 + 1*2 + 10*2 + 100*2 + 1000*2;
                    count += ((i%100000)/10)*2;
                } else {
                    count += 1*2 + 10*2 + 100*2 + 1000*2;
                    if (100000*(i%10) < i) {
                        count += 10000*2;
                    }
                }
            }
        }

        return count;
    }
}