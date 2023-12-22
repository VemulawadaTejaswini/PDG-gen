import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
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
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
        int key;
        int value;
        for (int i = 0; i < m; i++) {
            key = sc.nextInt();
            value = sc.nextInt();
            if ((maps.containsKey(key) && maps.get(key) != value) || (key == 1 && value == 0 && n != 1)) {
                System.out.println(-1);
                return;
            }
            maps.put(key, value);
        }
        String first_digit = "0";
        String second_digit = "0";
        String third_digit = "0";
        for (Map.Entry<Integer, Integer> map : maps.entrySet()) {
            if (map.getKey() == 1) {
                first_digit = String.valueOf(map.getValue());
            } else if (map.getKey() == 2) {
                second_digit = String.valueOf(map.getValue());
            } else if (map.getKey() == 3) {
                third_digit = String.valueOf(map.getValue());
            }
        }
        if (n == 1) {
            System.out.println(first_digit);
        } else if (n == 2) {
            if (maps.containsKey(1)) {
                System.out.println(first_digit+second_digit);
            } else {
                System.out.println("1"+second_digit);
            }
        } else {
            if (maps.containsKey(1)) {
                System.out.println(first_digit+second_digit+third_digit);
            } else {
                System.out.println("1"+second_digit+third_digit);
            }
        }
    }

}
