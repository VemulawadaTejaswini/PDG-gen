import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int sum_num = 0;
        int i9 = 0;
        while (Math.pow(9, i9 + 1) < N) {
            i9++;
        }

        int i6 = 0;
        while (Math.pow(6, i6 + 1) < N) {
            i6++;
        }

        for (int i = i9; i > 0; i--) {
            for (int j = i6; j  > 0; j--) {
                int pow9 = (int) Math.pow(9, i);
                int pow6 = (int) Math.pow(6, j);
                if (pow9 > pow6 && pow9 < N) {
                    N = N - pow9;
                    sum_num++;
                }
                if (pow6 > pow9 && pow6 < N) {
                    N = N - pow6;
                    sum_num++;
                }
            }
        }
        System.out.println(N);
        System.out.println(sum_num);
        sum_num += N;

        System.out.println(sum_num);
    }
}
