import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();

        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                String a = str.substring(i, j);
                char[] chars = a.toCharArray();
                boolean isACGT = true;
                for (int k = 0; k < chars.length; k++) {
                    if (chars[k] != 'A' && chars[k] != 'G' && chars[k] != 'C' && chars[k] != 'T') {
                        isACGT = false;
                    }
                }
                if (isACGT && (ans.length() < a.length())) {
                    ans = a;
                }
            }
        }
        System.out.println(ans.length());
    }

}