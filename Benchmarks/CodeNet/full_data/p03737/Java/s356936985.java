import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(a59_(sc.next(),sc.next(),sc.next()));
    }

    static String a59_(String s, String s1, String s2) {
        s = s.substring(0, 1).toUpperCase();
        s1 = s1.substring(0, 1).toUpperCase();
        s2 = s2.substring(0, 1).toUpperCase();
        return s + s1 + s2;
    }
}
