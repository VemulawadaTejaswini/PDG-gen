import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long k = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();
        long biscuits = a;
        long time = k - a + 1;

        if (a + 2 >= b || time < 0) {
            System.out.println("a "+k + 1);
        } else if (time % 2 == 0) {
            biscuits += ((b - a) * (time / 2));
            System.out.println(biscuits);
        } else {
            biscuits += ((b - a) * (time / 2)) + 1;
            System.out.println(biscuits);

        }
    }
}