import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String ss = sc.next();
        for (int i = 1; i < 4; i++) {
            if (ss.charAt(i) == ss.charAt(i-1)) {
                System.out.println("Bad");
                System.exit(0);
            }
        }
        System.out.println("Good");
    }

}
