import java.math.BigInteger;
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();

        Long[] list = new Long[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextLong();
        }

        Arrays.sort(list, Collections.reverseOrder());

        BigInteger ans = new BigInteger("0");
        for (int i = K; i < N; i++) {
            ans = ans.add(new BigInteger(list[i].toString()));
        }

        System.out.println(ans);
    }

    static double pre (int x) {
        return ((double)x + 1) / 2;
    }
}