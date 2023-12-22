import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();

        if (s.substring(0, 1).equals("k") || s.substring(len - 1, len).equals("e")) {
            if (s.contains("k") && s.contains("eyence")) {
                System.out.println("YES");
            } else if (s.contains("ke") && s.contains("yence")) {
                System.out.println("YES");
            } else if (s.contains("key") && s.contains("ence")) {
                System.out.println("YES");
            } else if (s.contains("keye") && s.contains("nce")) {
                System.out.println("YES");
            } else if (s.contains("keyen") && s.contains("ce")) {
                System.out.println("YES");
            } else if (s.contains("keyenc") && s.contains("e")) {
                System.out.println("YES");
            } else if (s.contains("keyence")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}










# メモ