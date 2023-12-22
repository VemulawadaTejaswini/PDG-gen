import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a;
        for (int i=0; i<N; i++) {
            a = sc.nextInt();
            if (a % 2 != 0) {
                System.out.println("first");
                return;
            }
        }
        System.out.println("second");
    }
}
