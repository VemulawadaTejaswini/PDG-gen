import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static int mod = (int) 10e8 + 7;

    public static void main(String[] args) {
        String s = sc.next();
        int count = 1;
        char cb = s.charAt(0);
        String sb;
        for (int i = 1; i < s.length(); i++) {
            if (cb != s.charAt(i)) {
                count++;
                cb = s.charAt(i);
            } else {
                if (i == s.length()-1) {
                    continue;
                } else {
                    i++;
                    count++;
                    cb = 'Z';
                }
            }
        }
        System.out.println(count);
    }

}
