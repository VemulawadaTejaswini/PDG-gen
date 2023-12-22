import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String text = sc.next();

        long ans = 0;

        for (int i = 0; i < 10; i++) {
            int iIndex = text.indexOf(String.valueOf(i));
            if (iIndex < 0) {
                continue;
            }
            for (int j = 0; j < 10; j++) {
                int jIndex = text.indexOf(String.valueOf(j), iIndex + 1);
                if (jIndex < 0) {
                    continue;
                }
                for (int k = 0; k < 10; k++) {
                    int kIndex = text.indexOf(String.valueOf(k), jIndex + 1);
                    if (kIndex >= 0) {
                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}