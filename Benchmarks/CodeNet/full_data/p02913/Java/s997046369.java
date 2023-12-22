import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        long base2 =1007;
        long mod2 = 1000000009;
        long[] hash2 = new long[n + 1];
        long[] pow2 = new long[n + 1];
        Arrays.fill(hash2, 0);
        Arrays.fill(pow2, 1);
        for(int i=0;i<n;i++) {
            hash2[i+1] = (hash2[i]+s.charAt(i)) * base2 % mod2;
            //  pow1[i+1] = pow1[i] * base1 % mod1;
            pow2[i+1] = pow2[i] * base2 % mod2;
        }
        HashMap<Long, Integer> map = new HashMap();

        long max = 0;
        for(int i=0;i<n;i++) {
            for (int j=(i + 1);j<=n;j++) {
                long sub = ((hash2[j] - hash2[i] * pow2[j - i]) % mod2 + mod2) % mod2;
                //long sub = ((hash2[j] - hash2[i] * pow2[j - i]) % mod2 + mod2) % mod2;
                Integer lastIndex = map.get(sub);
                if (lastIndex == null) {
                    map.put(sub, j - 1);
                } else {
                    if ((int) lastIndex < i) {
                        max = Math.max(max, j - i);
                    }
                }
            }
        }

        System.out.print(max);
        in.close();

    }

}
