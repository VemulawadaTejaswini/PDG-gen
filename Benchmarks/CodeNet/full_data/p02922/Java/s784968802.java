// 問題URL
// https://atcoder.jp/contests/abc139/tasks/abc139_b

import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer kuchi = Integer.parseInt(scanner.next());
        Integer mishiyou_kuchi = Integer.parseInt(scanner.next());

        Integer i = 1;
        for(;;) {
            if(kuchi *i > mishiyou_kuchi) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
