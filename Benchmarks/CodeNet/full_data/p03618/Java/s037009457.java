import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String str = new Scanner(System.in).next();
        set.add(str);

        int len  = str.length();
        for (int i=0; i<len-1; i++) {
            for (int j=i+2; j<=len; j++) {
                String newStr = str.substring(0, i) + new StringBuffer(str.substring(i, j)).reverse().toString() + str.substring(j, len);
                set.add(newStr);
            }
        }

        System.out.println(set.size());
    }
}
