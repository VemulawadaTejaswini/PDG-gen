import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int S = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i <= K; i++) {
            for (int j = 0; j <= K; j++) {
                if(S - i -j <= K) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}