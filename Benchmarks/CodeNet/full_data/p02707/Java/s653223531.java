// 問題URL
// https://atcoder.jp/contests/abc163/tasks/abc163_c

import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer[] a = new Integer[n -1];

        for(int i = 0; i < n -1; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }

        Integer[] total = new Integer[n];
        Arrays.fill(total, 0);
        Integer count = 0;
        for(int i = 1; i < total.length; i++) {
            for (int j = 0; j < a.length; j++){
                if(i == a[j]) {
                    total[count] += 1;
                }
            }
            count++;
        }

        for(int i = 0; i < total.length; i++) {
            System.out.println(total[i]);
        }
    }
}