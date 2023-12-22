import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next()
                .replaceAll("BC", "X").toCharArray();
        int len = arr.length;
        int ret = 0;// 操作回数
        int count_a = 0;// 'A'の検出回数
        for (int i = 0; i < len; i++) {
            char c = arr[i];
            if (c == 'A') {
                count_a++;
            } else if (c == 'X') {
                // Xの前のAの数だけAX->XA置換
                ret += count_a;
            } else {//BorC
                count_a = 0;
            }
        }
        System.out.println(ret);
    }
}
