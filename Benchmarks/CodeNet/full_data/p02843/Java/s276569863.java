import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int amari = x % 100;
        int div = x / 100;
        if (amari <= div * 5) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}