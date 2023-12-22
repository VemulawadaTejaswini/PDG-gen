import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String a = inp.next();
        String b = inp.next();
        String c = inp.next();
        char al = last(a);
        char bf = first(b);
        char bl = last(b);
        char cf = first(c);
        System.out.println(al == bf && bl == cf ? "YES" : "NO");
    }
    public static char first(String s) {
        return s.toCharArray()[0];
    }
    public static char last(String s) {
        char ss[] = s.toCharArray();
        return ss[ss.length - 1];
    }
}