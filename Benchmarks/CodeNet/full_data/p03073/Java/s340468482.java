import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] A = new int[s.length()];
        for (int i = 0; i < A.length; i++) A[i] = s.charAt(i)-'0';
        System.out.println(helper(A));
        sc.close();
    }

    public static int helper(int[] A) {
        int res = 0, count = 0;
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                if (A[i] != 0) res++;
                if (A[i] != 1) count++;
            } else {
                if (A[i] != 1) res++;
                if (A[i] != 0) count++;
            }
        }
        return Math.min(res, count);
    }
}