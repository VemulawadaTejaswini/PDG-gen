import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b) {
            System.out.println("delicious");
        } else if (a + x < b) {
            System.out.println("dangerous");
        } else {
            System.out.println("safe");
        }
    }

}
