import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[] cardStatus = new boolean[N];
        Arrays.fill(cardStatus, true);

        for (int i = 0; i < M; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            for (int j = 0; j < L - 1; j++) {
                cardStatus[j] = false;
            }

            for (int k = R; k < cardStatus.length; k++) {
                cardStatus[k] = false;
            }
        }
        sc.close();

        int cnt = 0;
        for (int i = 0; i < cardStatus.length; i++) {
            if (cardStatus[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
