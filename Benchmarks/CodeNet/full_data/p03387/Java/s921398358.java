import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();

        Arrays.sort(a);

        int ans = 0;
        //a[0]とa[1]の差が２で割り切れるない場合、a[2]とa[1]を＋1
        if (a[0] - a[1] % 2 == 1) {
            a[2]++;
            a[1]++;
            ans++;
        }
        //a[0]とa[1]の差の割る２回追加する。
        ans += (a[1] - a[0]) / 2;
        a[0] = a[1];

        //あとはa[0]まで＋１
        ans += a[2] - a[1];

        System.out.println(ans);
    }
}
