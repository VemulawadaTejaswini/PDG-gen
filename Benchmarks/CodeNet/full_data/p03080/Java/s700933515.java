

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int red = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'R') {
                ++red;
            }
        }
        int blue = s.length() - red;
        if (red > blue) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
