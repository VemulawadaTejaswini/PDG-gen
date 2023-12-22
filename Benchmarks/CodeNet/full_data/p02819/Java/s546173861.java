import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int answer = 0;
        while (true) {
            if (checkSosuOrNot(x)) {
                answer = x;
                break;
            }
            x++;
        }
        System.out.println(answer);
        sc.close();
    }

    // 引数が素数か判定
    private static boolean checkSosuOrNot(int n) {
        // 1以下の整数は素数にならない
        if (n <= 1) {
            return false;
        }
        // 1と自身を除くどの整数でも割り切れない値が素数となる
        // 引数を2～(引数-1)までの値で順番に割っていく
        for (int i = 2; i < n; i++) {
            // 余りが0ならば素数ではない
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
