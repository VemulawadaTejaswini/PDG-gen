import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        char a = a.charAt(a.length() - 1);
        char b1 = b.charAt(0);
        char b2 = b.charAt(b.length() - 1);
        char c = c.charAt(0);
        if(a == b1 && b2 == c) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}