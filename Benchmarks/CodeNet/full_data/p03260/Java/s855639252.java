import java.util.*;
import java.math.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        a = sc.nextInt();
	b = sc.nextInt();

        for (int c = 1; c <= 3; c++) {
            if ((a * b * c) % 2 != 0) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }

}