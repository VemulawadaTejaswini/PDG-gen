import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ret = "";
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == '1') ret += '9';
            else ret += '1';
        }
        System.out.println(ret);
    }
}