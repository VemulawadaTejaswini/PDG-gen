import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        if (s.charAt(0) == s.charAt(1) && s.charAt(2) == s.charAt(3) && s.charAt(0) != s.charAt(2)) {
            System.out.println("Yes");
        } else if (s.charAt(0) == s.charAt(2) && s.charAt(1) == s.charAt(3) && s.charAt(0) != s.charAt(1)) {
            System.out.println("Yes");
        } else if (s.charAt(0) == s.charAt(3) && s.charAt(1) == s.charAt(2) && s.charAt(0) != s.charAt(1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
