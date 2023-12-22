import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] cnt = new int[N];
        for (int i = 0; i <= N; i++) {
            int a = sc.nextInt();
            cnt[a]++;
        }

        int result = 0;
        for (int i = 0; i <= cnt.length; i++) {
            if (i != cnt[i]) {
                result += (i - cnt[i]);
            }
        }

        System.out.println(result);
    }
}
