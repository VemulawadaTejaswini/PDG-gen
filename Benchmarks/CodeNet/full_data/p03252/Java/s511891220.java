import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) != t.charAt(i)) {
                char a = s.charAt(i);
                char b = t.charAt(i);
                s = s.replace(b, '0');
                s = s.replace(a, b);
                s = s.replace('0', a);
            }else{
                continue;
            }
        }
        if (s.equals(t)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}