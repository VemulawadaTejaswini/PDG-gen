import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int t = s.length();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t; i++) {
            result.append("x");
        }

        System.out.println(result);
    }
}