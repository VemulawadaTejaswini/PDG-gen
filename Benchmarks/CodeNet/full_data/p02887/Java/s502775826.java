package miscellaneous;

import java.util.Scanner;

/**
 * Created by Krishna Kota on 26/10/19
 */

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        int count = 1;
        String str = "";
        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            str += x;
            if (i > 0 && !x.equals(str.charAt(i-1))) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
