import java.math.*;
import java.util.*;

public class Main {
    static void out(boolean b) {
        if (b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean Loop(String str) {
        int num = str.length();
        boolean tmp = true;
        if (num !=2) {
            for (int i = 0; i < (num - 1) / 2; i++) {
                if (str.charAt(i) != str.charAt(num - i - 1)) {
                    tmp = false;
                    break;
                }
            }
            return tmp;
        }
        else {
            return false;
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean isLoop = true;
        isLoop = Loop(s);
        if (isLoop) {
            isLoop = Loop(s.substring(0, (s.length() - 1 / 2 )));
            if (isLoop) {
                isLoop = Loop(s.substring((s.length() + 3 )/ 2 -1 ));
            }
        }
        out(isLoop);
        }
    }