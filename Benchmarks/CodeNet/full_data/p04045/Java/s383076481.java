
import java.util.*;

public class Main {
    private static int N, K, count;
    public static String solve(int[] ara, int k, int add) {
        int i;
        String number, ans;
        ans = "";
        number = Integer.toString(N);
        for (i = k; i < number.length(); i++) {
            int flag = find(ara, number.charAt(i) - 48 + add);
            if (flag == -1 && i == 0) {
                ans = Integer.toString(ara[K] != 0 ? ara[K] : ara[K+1]);
                for (int j = 0; j < K; j++) ans += ara[K];
                i = 5;
            }
            else if (flag == -1) {
                count++;
               ans = solve(ara, i - 1, 1);
               for (; i < number.length(); i++) ans += ara[K];
            }
            else if (flag > number.charAt(i) - 48 && count < 1){
                ans += flag;
                for (; i < number.length() - 1; i++) ans += ara[K];
                continue;
            }
            if (flag != -1) ans+=flag;
            if (count>0) return ans;
        }
        return ans;
    }
    public static int find(int[] ara, int num) {
        for (int i = num; i < 10; i++) {
            for (int j = K; j < 10; j++) {
                if (ara[j] == i) return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        K = input.nextInt();
        count = 0;
        int[] ara = new int[10];
        for (int i = 0; i < 10; i++) ara[i] = i;
        for (int i = 0; i < K; i++) ara[input.nextInt()] = 0;
        Arrays.sort(ara);
        System.out.println(solve(ara, 0, 0));
    }
}
