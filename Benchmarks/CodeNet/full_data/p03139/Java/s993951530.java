import java.util.*;
//package hoge; のようなパッケージ宣言は提出前に除く
//インポート文など
public class Main { //クラス名はMain
    public static void main(String[] args) {
        //コード
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int a = 0;
        int b = 0;
        while (sc.hasNextInt()){
            n = Integer.parseInt(sc.next());
            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
        }
        int resultA = 0;
        if (a < b) resultA = a;
        if (a >= b) resultA = b;
        int resultB = 0;
        if (a+b <= n) resultB = 0;
        if (a+b > n) resultB = a+b - n;
        System.out.println(resultA + " " + resultB);
    }
}