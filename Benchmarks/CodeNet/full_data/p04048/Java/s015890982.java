import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int ans = N;
        if(N % 2 == 0) {
            ans += (X - (N / 2) + 1) * 3;
        } else {
            ans += ((N - 3) / 2) * 4 + 3;
        }
        System.out.println(ans);
    }

}