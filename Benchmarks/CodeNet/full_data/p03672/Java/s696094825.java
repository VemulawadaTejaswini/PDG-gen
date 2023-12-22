

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.next();

            for (int len = s.length() / 2 - 1; len >= 1; len--) {
                String left = s.substring(0, len);
                String right = s.substring(len, len + len);
                if (left.equals(right)) {
                    System.out.println(len * 2);
                    break;
                }
            }
        }
    }
}
