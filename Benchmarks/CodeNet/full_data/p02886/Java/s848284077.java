import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int taco[] = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            taco[i] = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                sum += taco[i] * taco[j];
            }
        }
        System.out.println(sum);
    }
}
