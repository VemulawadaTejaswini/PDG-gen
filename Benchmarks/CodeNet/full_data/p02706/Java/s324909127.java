import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer N = input.nextInt();
        Integer M = input.nextInt();
        int sum = 0;
        for (int i = 0; i < M; i++) {
            sum += input.nextInt();
        }
        if (N >= sum) System.out.println(N - sum);
        else System.out.println(-1);
    }
}
