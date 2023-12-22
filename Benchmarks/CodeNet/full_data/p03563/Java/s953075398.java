import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().start();
    }

    void start() throws Exception {
        start(new Scanner(System.in));
    }

    void start(Scanner sc) throws Exception{
        int r = sc.nextInt();
        int g = sc.nextInt();
        int ans = 2 * g - r;
        System.out.println(ans);
    }
}
