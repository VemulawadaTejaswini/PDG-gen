import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int X = sc.nextInt();

            int a = X / 100;
            int b = X % 100;

            if (b <= a * 5) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

}
