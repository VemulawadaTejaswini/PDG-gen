import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int ans = 0;
        if(X == 1) {
            ans += 300000;
        }else if(X ==2) {
            ans += 200000;
        }else if(X == 3) {
            ans += 100000;
        }
        if(Y == 1) {
            ans += 300000;
        }else if(Y ==2) {
            ans += 200000;
        }else if(Y == 3) {
            ans += 100000;
        }
        if(X == Y && X == 1) {
            ans += 400000;
        }

        System.out.println(ans);
    }
}