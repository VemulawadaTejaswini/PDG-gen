import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int T = scanner.nextInt();
        int time = 0;
        int biscuitNum = 0;

        if(A <= T) {
            for (int i = 0; time < T + 0.5; i++) {
                time += A * (i + 1);
                biscuitNum += B;
            }
        }
        System.out.println(biscuitNum);
    }
}
