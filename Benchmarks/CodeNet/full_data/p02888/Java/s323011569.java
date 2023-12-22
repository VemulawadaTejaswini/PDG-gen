import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        Arrays.sort(l);

        for (int i = n - 1; i > 1; i--) {
            for (int j = i - 1; j > 0; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if (l[i] < (l[j]+l[k]) && l[j] < (l[i]+l[k]) && l[k] < (l[j]+l[i])) {
                        ans++;
                    } else {
                        continue;
                    }
                }
            }
        }

        System.out.println(ans);

        sc.close();
    }    
}
