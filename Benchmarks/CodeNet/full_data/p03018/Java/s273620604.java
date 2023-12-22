import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        long count_operate = 0L;// 操作回数
        long count_a = 0L;// 'A'の検出回数
        char last = 'X';// "ABC"以外で初期化
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                count_a++;
                last = 'A';
            } else if (c == 'B') {
                if (last != 'A') {
                    count_a = 0L;
                }
                last = 'B';
            } else {//'C'
                if (last == 'B' && count_a != 0L) {
                    count_operate += count_a;
                    // BCの前のAの数だけABC->BCA置換
                    last = 'A';
                } else {
                    count_a = 0L;
                    last = 'C';
                }
            }
        }
        System.out.println(count_operate);
    }
}