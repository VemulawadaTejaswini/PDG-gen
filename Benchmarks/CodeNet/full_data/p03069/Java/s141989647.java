import java.util.Scanner;

public class Main {

    static int firstBlack = 0;
    static int afterBlack = 0;
    static int ans = 0;

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int count = 0;
        int progress = 200000;
        while (true) {
            firstBlack = 0;
            afterBlack = 0;

            GetAfterBlack(S);

            if (firstBlack == 0) {
                if (count == 0) ans = 0;
                else ans = progress;
                break;
            }
            else if (afterBlack == 0) {
                ans = afterBlack + count;
                break;
            }
            else {
                if (afterBlack + count < progress) {
                    progress = afterBlack + count;
                }
                S = S.substring(firstBlack);
                count++;
            }
        }

        System.out.println(ans);
    }

    public static void GetAfterBlack(String S) {
        // 黒1文字目を取得
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#') {
                firstBlack = i + 1;
                break;
            }
        }

        // 後ろの黒の数を取得
        if (firstBlack != 0) {
            for (int i = firstBlack; i < S.length(); i++) {
                if (S.charAt(i) == '.') {
                    afterBlack += 1;
                }
            }
        }
    }
}
