import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int x = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    if (i * 500 + j * 100 + k * 50 == x) {
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}