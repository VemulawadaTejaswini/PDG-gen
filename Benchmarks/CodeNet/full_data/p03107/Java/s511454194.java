import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '0') {
                count++;
            }
        }
        System.out.println(Math.min(len - count, count) * 2);
    }
}
