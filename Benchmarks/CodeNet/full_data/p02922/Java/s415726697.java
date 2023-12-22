import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b) {
            System.out.println(1);
        } else {
            System.out.println((b - 1 + a - 2) / (a -1));
        }
    }

}
