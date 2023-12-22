import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ##### 初期読み込み #######################################################################
        // 1行 文字 1文字 ---------------------------------------------------------------------------
        String b = scanner.nextLine();

        // ##### メイン処理 #######################################################################
        char[] words = b.toCharArray();
        if (words[2] == words[3] && words[4] == words[5]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}