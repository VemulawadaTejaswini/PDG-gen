import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[][] words = new String[n][];
        String thisLoop = "";
        String next = "";
        int ans = 0;
        for (int i = 0; i < n; i++) {
            words[i] = sc.next().split("");
            Arrays.sort(words[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < 10; k++) {
                    thisLoop += words[i][k];
                    next += words[j][k];
                    if (k == 9 && i != j && thisLoop.equals(next)) ans++;
                }
                thisLoop = "";
                next = "";
            }
        }
        System.out.println(ans);
    }
}
