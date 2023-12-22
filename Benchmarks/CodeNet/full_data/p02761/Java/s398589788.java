import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n];
        Arrays.fill(a, -1);

        boolean bl = true;
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt() - 1;
            int num = sc.nextInt();
            if (a[k] == -1) {
                a[k] = num;
            } else {
                if (a[k] != num) {
                    bl = false;
                    break;
                }
                //0以外の00 000はダメ
                if (k == 1 && num == 0 && n > 1) {
                    bl = false;
                    break;
                }
            }
        }
        //-1 は最小値0に置き換え ひとけた目から-1の場合は桁数を削除するためそのまま
        boolean zeroCounter = a[0] == -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == -1 && !zeroCounter) {
                a[i] = 0;
            }
        }


        if (m == 0) {
            System.out.println(0);
        } else if (bl) {
            for (int num : a) {
                if (num != -1) System.out.print(num);
            }
            System.out.println();
        } else {
            System.out.println(-1);
        }
    }
}
