import java.util.Scanner;

class St {

    public static String merge(String s, String t) {
        return t + s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        System.out.println(merge(s1, s2));
    }
}