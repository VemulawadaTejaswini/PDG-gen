import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();

        if (D == 0) {
            System.out.println(N);
        } else if (D == 1) {
            System.out.println(N * 100);
        } else {
            System.out.println(N * 1000);
        }
    }
}
