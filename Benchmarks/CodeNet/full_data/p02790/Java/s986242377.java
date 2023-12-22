import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 処理
        StringBuilder work = new StringBuilder();
        for (int i = 0; i < b; i++) {
            work.append(Integer.toString(a));
        }
        String aaa = work.toString();

        StringBuilder work1 = new StringBuilder();
        for (int i = 0; i < a; i++) {
            work1.append(Integer.toString(b));
        }
        String bbb = work1.toString();

        String out = aaa.compareTo(bbb) > 0 ? bbb : aaa;

        // 出力
        System.out.println(out);
    }
}