import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length() - 2;
        System.out.println(String.valueOf(s.charAt(0)) + n + s.charAt(s.length() - 1));
    }
}
