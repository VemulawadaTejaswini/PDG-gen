import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int max = 0;
        for (int i = 1 ; i <= x ; i++) {

            for (int j = 2 ; j <= 31 ; j++) {
                int n = 1;
                while (n * j <= x) {
                    n *= j;
                }
                max = Math.max(max, n);
            }
        }
        System.out.println(max);
    }

}