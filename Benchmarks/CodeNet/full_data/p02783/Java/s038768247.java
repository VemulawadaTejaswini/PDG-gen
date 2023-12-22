import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int A = sc.nextInt();

        for (int i = 0; i < 100000; i++) {
            if (i * A >= H) {
                System.out.println(i);
                return;
            }
        }
    }
}
