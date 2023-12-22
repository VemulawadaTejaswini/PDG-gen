import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int ans  = N - K;
        if(K == 1){
            System.out.println(0);
            return;
        }
        System.out.println(ans);

    }
}
