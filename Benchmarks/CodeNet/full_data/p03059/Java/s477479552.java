import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        int biscuit = 0;

        for (int time = A; time <= T; time += A) {
            biscuit += B;
        }
        System.out.println(biscuit);
    }
}