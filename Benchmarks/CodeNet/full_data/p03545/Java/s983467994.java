import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.nextLine().toCharArray();
        int n = S.length;

        for (int i = 0; i < (1 << n - 1); i++) {
            long sum = (S[0] - '0');
            String res = "" + S[0];
            for (int j = 0; j < n - 1; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += S[j + 1] - '0';
                    res += "+";
                } else {
                    sum -= S[j + 1] - '0';
                    res += "-";
                }
                res += S[j + 1];
            }

            if (sum == 7) {
                System.out.print(res + "=7");
                return;
            }
        }
    }
}
