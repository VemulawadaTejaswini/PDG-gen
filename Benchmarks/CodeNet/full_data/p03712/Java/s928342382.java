import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] s = new String[h];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < w + 2; i++) {
            sb.append('#');
        }
        System.out.println(sb);
        for (int i = 0; i < h; i++) {
            System.out.println("#" + s[i] + "#");
        }
        System.out.println(sb);
    }
}