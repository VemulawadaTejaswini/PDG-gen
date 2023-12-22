import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] alreadyAC = new boolean[n];
        long[] penaltyCount = new long[n];
        for(int i = 0; i < m; ++i) {
            int p = sc.nextInt() - 1;
            String s = sc.next();
            if(!alreadyAC[p]) {
                penaltyCount[p] += (s.equals("WA")) ? 1 : 0;
                alreadyAC[p] = s.equals("AC");
            }
        }

        long acSum = 0, penaltySum = 0;
        for(int i = 0; i < n; ++i) {
            acSum += (alreadyAC[i]) ? 1 : 0;
            penaltySum += penaltyCount[i];
        }

        System.out.printf("%d %d", acSum, penaltySum);
    }
}