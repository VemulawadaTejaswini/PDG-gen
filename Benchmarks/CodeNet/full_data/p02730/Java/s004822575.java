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
        String bef = str.substring(0, ((num - 1) / 2) );
        String aft = str.substring(((num - 1 )/ 2 )+1);
        boolean tmp = true;
        for (int i = 0; i < bef.length(); i++) {
            if (bef.charAt(i) != aft.charAt(bef.length()-1- i)) {
                tmp = false;
                break;
            }
        }
        return tmp;
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