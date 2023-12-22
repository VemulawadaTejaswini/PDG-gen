import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(sc.next());
            H -= A;
            if (H <= 0) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
