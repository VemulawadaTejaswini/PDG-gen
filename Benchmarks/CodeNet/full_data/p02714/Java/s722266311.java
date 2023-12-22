import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S1 = sc.next();
        char[] S = S1.toCharArray();

        int num_r = 0, num_g = 0, num_b = 0;

        for (int i = 0; i < N; i++) {
            if (S[i] == 'R') {
                num_r++;
            } else if (S[i] == 'G') {
                num_g++;
            } else {
                num_b++;
            }
        }

        long all = num_r * num_g * num_b;

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < j; i++) {
                int d = j - i;

                if (j + d >= N || S[i] == S[j]) {
                    continue;
                }

                if (S[i] != S[j + d] && S[j] != S[j + d]) {
                    all--;
                }
            }
        }

        System.out.println(all);
    }
}
