import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int s = sc.nextInt();

        int count = 0;
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= k; j++) {
                for (int l = 0; l <= k; l++) {
                    if (i + j + l == s) {
                      count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}