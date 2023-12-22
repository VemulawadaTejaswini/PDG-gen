import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        int K = stdin.nextInt();

        Integer l[] = new Integer[N];

        for (int i = 0; i < N; i++) {
            l[i] = stdin.nextInt();
        }

        Arrays.sort(l, Comparator.reverseOrder());

        int max = 0;

        for (int i = 0; i < K; i++) {
            max += l[i];
        }
        System.out.println(max);
    }
}
