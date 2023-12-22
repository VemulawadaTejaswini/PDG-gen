import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        sc.close();
        int ans = 0;
        int i = 0;
        while (true) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < k; j++) {
                int num = list.get(i + j);
                min = Math.min(min, num);
            }
            for (int j = 0; j < k; j++) {
                list.add(j + i, min);
            }
            if (i + k >= n) {
                ans++;
                break;
            }
            ans++;
            i += k - 1;
        }
        System.out.println(ans);

    }
}