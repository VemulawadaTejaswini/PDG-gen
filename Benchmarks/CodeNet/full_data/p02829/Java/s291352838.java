// 問題URL
// https://atcoder.jp/contests/abc148/tasks/abc148_a

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.next());
        Integer b = Integer.parseInt(scanner.next());
        Integer result;
        Integer total = Integer.sum(a, b);
        if (total > 3) {
            result = a - b;

        } else {
           result = a + b;
        }
        System.out.println(result);
    }
}