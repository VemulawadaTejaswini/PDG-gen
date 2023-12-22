import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int water = a - b;
        if (water <= 0) {
            System.out.println(0);
        } else {
            System.out.println(Math.max(0, c - water));
        }
        sc.close();
    }
}