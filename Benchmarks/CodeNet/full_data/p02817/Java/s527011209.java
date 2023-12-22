
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        String S;
        String T;
        try (Scanner sc = new Scanner(System.in)) {
            S = sc.next();
            T = sc.next();
        }


        System.out.println(T+S);
    }
}
