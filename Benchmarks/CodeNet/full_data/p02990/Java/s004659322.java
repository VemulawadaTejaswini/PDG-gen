import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = (calcNumOfCombination(n - k + 1, i + 1) * calcNumOfCombination(k - 1, i)) % 1000000007;
        }
        for (int i = 0; i < k; i++)
            System.out.println(ans[i]);
    }

    // 組み合わせの数nCrを計算
    static int calcNumOfCombination(int n, int r) {
        int num = 1;
        for (int i = 1; i <= r; i++) {
            num = num * (n - i + 1) / i;
        }
        return num;
    }
}