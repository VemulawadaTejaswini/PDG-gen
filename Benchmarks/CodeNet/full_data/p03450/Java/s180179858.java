import java.util.*;

/*
x  軸上に N 人の人が立っています。 人 i の位置を xi とします。
任意の i に対して、xi は 0 以上109 以下の整数です。
同じ位置に複数の人が立っていることもありえます。

これらの人の位置に関する情報が M個与えられます。
このうち i個めの情報は (Li,Ri,Di) という形をしています。
この情報は、人 Ri は人 Li よりも距離 Di だけ右にいること、
すなわち、xRi−xLi=Di が成り立つことを表します。

これら M 個の情報のうちのいくつかに誤りがある可能性があることがわかりました。
与えられる M 個すべての情報と矛盾しないような値の組 (x1,x2,...,xN) が存在するかどうか判定してください。
*/

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int l[] = new int[m];
        int r[] = new int[m];
        int d[] = new int[m];

        String ans = "Yes";
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            l[i] = s.nextInt();
            r[i] = s.nextInt();
            d[i] = s.nextInt();
            map.put(r[i] + "-" + l[i], d[i]);
        }

        for (int j = 0; j < m; j++) {
            for (int k = 0; k < m; k++) {
                if (map.get(String.valueOf(r[k]) + "-" + String.valueOf(l[j])) == null) {
                    map.put(String.valueOf(r[k]) + "-" + String.valueOf(l[j]), r[k]-l[j]);
                } else {
                    int temp = map.get(String.valueOf(r[k]) + "-" + String.valueOf(l[j]));
                    if (temp != r[k]-l[j]) {
                        ans = "No";
                        break;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}