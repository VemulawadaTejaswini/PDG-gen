import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int next = N;
        int sum = 0;
        for (int i = 0; i < String.valueOf(N).length(); i++) {
            sum += next % 10;
            next /= 10;
        }
        if (N % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}