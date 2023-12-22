import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = sc.next().split("");

        long ans = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (s[i].equals(s[j])) {
                    continue;
                }
                for (int k = j + 1; k < n; k++) {
                    if (j - i == k - j) {
                        continue;
                    }
                    if (!s[j].equals(s[k]) && !s[k].equals(s[i])) {
                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);

    }
}