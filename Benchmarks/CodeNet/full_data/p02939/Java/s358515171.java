import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 1;
        String prev = String.valueOf(s.charAt(0));
        String str = "";
        for(int i = 1; i < s.length();i++) {
            str += String.valueOf(s.charAt(i));
            if (!prev.equals(str)) {
                count++;
                prev = str;
                str = "";
            }
        }
        System.out.println(count);
    }
}
