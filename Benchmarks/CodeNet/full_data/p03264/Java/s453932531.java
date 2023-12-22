import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int res;
        if (K % 2 == 0) {
            res = (K/2)*(K/2);
        } else {
            res = (K/2+1)*(K/2);
        }
        System.out.println(res);
    }
}
