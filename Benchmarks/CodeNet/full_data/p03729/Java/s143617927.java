import java.util.*;
public class Main {
    public static char left(String s){
        return s.charAt(0);
    }

   public static char right(String s) {
        return s.charAt(s.length() - 1);
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b,c;
        a = sc.next();
        b = sc.next();
        c = sc.next();
        boolean ans = (left(b) == right(a)) && (right(b) == left(c));
        if (ans) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

        return;
    }
}


