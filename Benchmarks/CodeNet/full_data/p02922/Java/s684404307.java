import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int a = sc.nextInt();
        int b = sc.nextInt();

        int t = 1;
        int ans = 0;
        while (t < b) {
            ans++;
            t += a - 1;
        }
        System.out.println(ans);


    }
}

