import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        int a = s.length();
        int z = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                if (i < a) {
                    a = i;
                }
            }
            if (s.charAt(i) == 'Z') {
                if (i > z) {
                    z = i;
                }
            }
        }
        System.out.println(z-a+1);
    }

}
