import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int N = sc.nextInt();

        int sumA = 0;

        for (int i = 0; i < N; i++) {
            sumA += sc.nextInt();
        }

        System.out.println(H <= sumA ? "Yes" : "No");
    }
}
