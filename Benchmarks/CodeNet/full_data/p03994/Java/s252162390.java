import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int k = sc.nextInt();
        for (int i = 0; i < s.length ; i++) {
            int v = s[i];
            if (v > 97 && v + k > 122) {
                s[i] = 97;
                k -= 123 - v;
            }
        }
        s[s.length - 1] += k;
        StringBuilder builder = new StringBuilder();
        for (char v: s
             ) {
            builder.append(v);
        }
        System.out.println(builder);
    }
}