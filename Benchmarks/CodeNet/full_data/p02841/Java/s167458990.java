import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int M1 = scanner.nextInt();
        int D1 = scanner.nextInt();
        int M2 = scanner.nextInt();
        int D2 = scanner.nextInt();

        int ans = 0;
        if(M1 != M2) ans = 1;
        System.out.println(ans);
    }
}