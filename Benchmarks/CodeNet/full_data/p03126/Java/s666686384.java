import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] marray = new int[m];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            for (int j = 0; j < num; j++) {
                int work = sc.nextInt();
                marray[work - 1]++;
            }
        }

        int cnt = 0;

        for (int a : marray) {
            if (a == n) {
                cnt++;
            }
        }
        sc.close();
        System.out.println(cnt);
    }
}
