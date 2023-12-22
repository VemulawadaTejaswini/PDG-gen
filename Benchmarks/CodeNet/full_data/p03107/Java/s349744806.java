import java.util.*;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int beforeSize = a.length();
        int beforeSizeTemp = a.length();
        while (true) {
            a = a.replace("01", "");
            a = a.replace("10", "");
            if (beforeSizeTemp == a.length()) {
                break;
            }
            beforeSizeTemp = a.length();
        }
        System.out.println(beforeSize - a.length());
    }
}
