import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N];
        for (int i = 0; i < N; i += 1) {
            L[i] = sc.nextInt();
        }

        int sum = 0;
        int max = 0;
        for (int Li : L) {
            if (max < Li) {
                max = Li;
            }
            sum += Li;
        }

        if (max < sum - max) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
