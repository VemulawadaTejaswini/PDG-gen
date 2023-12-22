import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();

        for(int i = X - (K -1); i < X + K; i ++) {
            System.out.print(i);
            if(i+1 < X + K)System.out.print(" ");
        }


    }
}
