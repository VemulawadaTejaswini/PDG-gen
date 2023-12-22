import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int array[] = new int[n + 1];

        int ans = 0;
        int wa = 0;

        for (int i = 0; i < m; i++) {
            int prb = sc.nextInt();
            String res = sc.next();

            if (array[prb] == -1) continue;

            if (res.equals("AC")) {
                wa += array[prb];
                ans++;
                array[prb] = -1;
            } else {
                array[prb]++;
            }
        }

        System.out.println(ans + " " + wa);

        sc.close();

    }

}