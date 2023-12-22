import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int ans = B / (A - 1);
        if(B % (A - 1) > 1) {
            ans++;
        }
        System.out.println(ans);
    }
}