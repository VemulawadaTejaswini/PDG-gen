import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
//        int ans = N % 2 == 0 ? N / 2 : N / 2 + 1;
        System.out.println(N % 2 == 0 ? N / 2 : N / 2 + 1);
    }
}