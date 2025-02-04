import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<s.length(); i++) {
            String l = String.valueOf(s.charAt(i));
            if(l.equals("0") || l.equals("1")) {
                sb.append(l);
            } else if(l.equals("B") && sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        System.out.println(sb.toString());

        in.close();
    }
}
