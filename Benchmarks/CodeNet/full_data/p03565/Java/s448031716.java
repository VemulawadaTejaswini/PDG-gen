import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sStr = s.next();
        String tStr = s.next();

        int tLength = tStr.length();
        int i = sStr.length() - tLength;
        boolean found = false;
        if (sStr.contains(tStr)) {
            found = true;
        } else {
            for (i = sStr.length() - tLength; i > 0; i--) {
                boolean good = true;
                for (int j = 0; j < tLength; j++) {
                    if (sStr.charAt(j + i) != '?' && sStr.charAt(j + i) != tStr.charAt(j)) {
                        good = false;
                        break;
                    }
                }
                if (good) {
                    found = true;
                    sStr = sStr.substring(0, i) + tStr + sStr.substring(i + tLength, sStr.length());

                    break;
                }
            }
        }
        if (found) {
            String a = "";
            for (int j = 0; j < sStr.length(); j++) {
                if (sStr.charAt(j) == '?') {
                    a += 'a';
                } else {
                    a += sStr.charAt(j);
                }
            }
            System.out.println(a);
        } else {
            System.out.println("UNRESTORABLE");
        }
    }
}
