
// 問題URL
// https://atcoder.jp/contests/abc150/tasks/abc150_b

import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {

    public static int search(String text, String pattern) {
        int textLen = text.length();
        int patLen = pattern.length();
        int[] skip = new int[Character.MAX_VALUE];

        Arrays.fill(skip, patLen);
        for(int x = 0; x < patLen; x++) {
            skip[pattern.charAt(x)] = patLen - x - 1;
        }

        int i = patLen - 1;
        while (i < textLen) {
            int j = patLen - 1;

            while(text.charAt(i) == pattern.charAt(j)) {
                if (j == 0) return i;
                i--; 
                j--;
            }
            i = i + Math.max(skip[text.charAt(i)], patLen - j);
        }

        return -1;
    }

    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer x = Integer.parseInt(scanner.next());
        String text = scanner.next();
        String pattern = "ABC";

        int count = 0;
        int result = -1;
        for(;;){
            result = search(text, pattern);
            if (result == -1) break;
            text = text.substring(result + pattern.length());
            count++;
        }

        System.out.println(count);
    }
}
