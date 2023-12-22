import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        String S = sc.next();
        
        int[] len = new int[(N - 1) * N];
        int max = 0;
        char[] chars = S.toCharArray();
        for (int i = 0; i < N - 1; i++) {
            char c = chars[i];
            for (int offset = N - i - 1; offset > max; offset--) {
                if (c != chars[i + offset]) continue;
                int combo = i > 0 ? len[offset * N + i - 1] + 1 : 1;
                if (combo >= offset){
                    max = offset;
                    break;
                }
                max = Math.max(max, len[offset * N + i] = combo);
            }
        }
        System.out.println(max);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}