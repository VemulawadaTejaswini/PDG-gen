import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] as = new int[N];

        for (int i = 0; i < N; i++) {
            as[i] = scanner.nextInt();
        }

        int before = 0;
        int temp = 1; // 連続する番号
        int sum = 0;
        for (int a : as) {
            if (before == a) {
                temp++;
            } else {
                sum += temp / 2;
                temp = 1;
            }
            before = a;
        }

        System.out.println(sum);
    }
}