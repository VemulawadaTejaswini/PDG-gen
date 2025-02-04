import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int maxLength = 0;

        int curLength = 0;
        for (int i = 0; i < s.length(); i += 1) {
            char si = s.charAt(i);
            if (si == 'A' || si == 'C' || si == 'G' || si == 'T') {
                curLength += 1;
                if (maxLength < curLength) {
                    maxLength = curLength;
                }
            } else {
                curLength = 0;
            }
        }

        System.out.println(maxLength);
    }

}
