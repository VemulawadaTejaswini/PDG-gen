import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String[] li = new String[N];
        //一回改行させる
        String none = s.nextLine();
        char ans[][] = new char[N][10];
        for (int i = 0; i < N; i++) {
            li[i] = s.nextLine();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                ans[i][j] = li[i].charAt(j);
            }
        }
        for (int i = 0; i < N; i++) {
            Arrays.sort(ans[i]);
        }
        int answer = 0;
        int x = 0;

        for (int i = 0; i < N; i++) {
            x = 0;
            for (int k = 0; k < N; k++) {
                for (int j = 0; j < 10; j++) {
                    if (i >= k) {
                        break;
                    }
                    if (ans[i][j] == ans[k][j]) {
                        x++;
                    }
                }

                if (x == 10) {
                    answer++;
                }
                x = 0;
            }
        }

        System.out.println(answer);
    }
}

