import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] problem = new int[n+1];
        int[] wa = new int[n+1];
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            String s = sc.next();
            if ("AC".equals(s)) {
                problem[p] = 1;
            } else {
                if (problem[p] != 1) {
                    wa[p]++;
                }
            }
        }

        int sumWA = 0;
        int sumAC = 0;
        for (int i = 0; i < n+1; i++) {
            if (problem[i] == 1) {
                sumAC++;
                sumWA += wa[i];
            }
        }

        System.out.println(sumAC +" "+sumWA);
    }
}
