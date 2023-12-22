import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int A3 = sc.nextInt();

        if ((A1 + A2 + A3) >= 22) {
            System.out.println("bust");
        } else {
            System.out.println("win");
        }

        sc.close();
    }
}