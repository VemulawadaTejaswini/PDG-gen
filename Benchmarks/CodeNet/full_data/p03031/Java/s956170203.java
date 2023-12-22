import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] k = new int[m];
        int[][] s = new int[m][];
        for (int i = 0; i < m; i++) {
            k[i] = sc.nextInt();
            s[i] = new int[k[i]];
            for (int j = 0; j < k[i]; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }
        sc.close();

        int ans = 0;
        for (int i = 0; i < pow(2, n); i++) {
            String target = toBinaryString(i);
            boolean isOk = true;
            for (int j = 0; j < m; j++) {
                int count = 0;
                for (int a = 0; a < k[j]; a++) {
                    if (target.charAt((target.length() - 1) - (s[j][a] - 1)) == '1') {
                        count++;
                    }
                }
                if (count % 2 != p[j]) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    // intを13桁のbit文字列に変換
    static String toBinaryString(int input) {
        String ret = "";
        int max = 0x00001000;
        for (int i = 0; i < 13; i++) {
            int tmp = input / max;
            ret += tmp;
            input %= max;
            max /= 2;
        }
        return ret;
    }

    // baseのn乗を計算を返す
    static int pow(int base, int n) {
        int ret = 1;
        for (int i = 0; i < n; i++) {
            ret *= base;
        }
        return ret;
    }

}
