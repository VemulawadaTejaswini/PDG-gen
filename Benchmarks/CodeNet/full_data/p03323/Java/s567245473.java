import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean aa = a>8;
        boolean bb = b>8;
        boolean xx = !(aa || bb);
        if (xx) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }

    }
}
