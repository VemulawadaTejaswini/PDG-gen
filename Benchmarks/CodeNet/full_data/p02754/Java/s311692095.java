// 問題URL
// https://atcoder.jp/contests/abc158/tasks/abc158_b

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer ao = Integer.parseInt(scanner.next());
        Integer aka = Integer.parseInt(scanner.next());

        String count_balls = new String();
        for(int i =0; i <  n; i++) {
            for (int j = 0; j < i* ao; j++) {
                count_balls += 'b';
            }

            for (int k = 0; k < i* aka; k++) {
                count_balls += 'r';
            }
            if ( n < count_balls.length()) {
                break;
            }
        }
        System.out.println(count_balls.substring(0, n));
    }
}