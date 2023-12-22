import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Q = sc.nextInt();
        boolean nowReverse = false;
        List<String> listL = new ArrayList<String>();
        List<String> listR = new ArrayList<String>();
        for (int i = 0; i < Q; i++) {
            int T = sc.nextInt();
            if (T == 1) {
                nowReverse = nowReverse? false : true;
            } else {
                int F = sc.nextInt();
                String C = sc.next();
                if (F == 1) {
                    if (nowReverse) {
                        listR.add(C);
                    } else {
                        listL.add(C);
                    }
                } else {
                    if (nowReverse) {
                        listL.add(C);
                    } else {
                        listR.add(C);
                    }
                }
            }
        }
        String L = "";
        String R = "";
        for (String c : listL) {
            L += c;
        }
        for (String c : listR) {
            R += c;
        }
        S = reverseString(L) + S + R;
        System.out.println(nowReverse? reverseString(S) : S);
    }

    public static String reverseString(String S) {
        StringBuffer str = new StringBuffer(S);
        return str.reverse().toString();
    }
}