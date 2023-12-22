import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nValue; // 1 <= N
        int kValue; //<= 100
        int checkN; //

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 以上 N 以下の異なる整数を、差が 1 の整数をともに選ばないように K 個選びます");
        System.out.println("NとKをそれぞれ半角空白で区切って入力してください");
        System.out.println("例: input ->10 90");
        System.out.println("input >>");

        String N = scanner.next();
        String K = scanner.next();

        nValue = Integer.valueOf(N);
        kValue = Integer.valueOf(K);


        if (100 < kValue || kValue < 1) {
            System.out.println("Kの値は1以上100以下の整数を入力してください。終了します。");
            return;
        }
        if (nValue < 2) {
            System.out.println("Nの値は1以上の整数を入力してください。終了します。");
            return;
        }

        if (nValue % 2 == 1) {
            checkN = nValue + 1;
        } else {
            checkN = nValue;
        }

        if ((checkN  /  2) >= kValue ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
