import java.util.Scanner;

/**
 * Who Says a Pun?
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String S = sc.next();

            int max = 0;
            for (int i = 0; i < N; i++) {
                int[] prefix = zAlgorithm(S.substring(i));
                for (int j = 1; j < prefix.length; j++) {
                    if (max < prefix[j]) {
                        if (prefix[j] < j) {
                            max = prefix[j];
                        } else if (max < j) {
                            max = j;
                        }
                    }
                }
            }

            System.out.println(max);
        }
    }

    public static int[] zAlgorithm(String S) {
        int[] prefix = new int[S.length()];

        for (int i = 1, j = 0; i < S.length(); i++) {
            if (i + prefix[i - j] < j + prefix[j]) {
                prefix[i] = prefix[i - j];
            } else {
                int k = Math.max(0, j + prefix[j] - i);
                while (i + k < S.length() && S.charAt(k) == S.charAt(i + k)) {
                    k++;
                }
                prefix[i] = k;
                j = i;
            }
        }

        prefix[0] = S.length();

        return prefix;
    }

}
