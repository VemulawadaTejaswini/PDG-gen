import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char prev = s.charAt(0);
        int count = 0;
        for(int i = 1; i < s.length(); i++) {
            if(prev == s.charAt(i)) {
                continue;
            } else {
                prev = s.charAt(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
