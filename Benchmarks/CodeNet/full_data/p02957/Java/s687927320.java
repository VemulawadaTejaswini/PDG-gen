package atcoder.abc135;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int a = s.nextInt();
            int b = s.nextInt();
            int max = (int) Math.pow(10, 9);
            boolean found = false;
            for (int i = 0; i < max; i++) {
                if (Math.abs(a - i) == Math.abs(b - i)) {
                    System.out.println(i);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("IMPOSSIBLE");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
