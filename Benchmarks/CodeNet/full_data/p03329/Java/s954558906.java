import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int i9 = 0;
        while (Math.pow(9, i9 + 1) <= N) {
            i9++;
        }

        int i6 = 0;
        while (Math.pow(6, i6 + 1) <= N) {
            i6++;
        }

        int i = i9;
        int j = i6;

        int sum_num = 0;
        int pow9;
        int pow6;
        while (N > 5) {
            pow9 = (int) Math.pow(9, i);
            pow6 = (int) Math.pow(6, j);

            while (pow9 > N) {
                i--;
                pow9 = (int) Math.pow(9, i);
            }
            while (pow6 > N) {
                j--;
                pow6 = (int) Math.pow(6, j);
            }

            if (i == 0 && j == 0) {
                break;
            }

            if (pow6 > pow9 || N < 9 && pow9 == 9 && pow6 == 6) {
                N -= pow6;
                sum_num++;
            } else if (pow9 > pow6) {
                N -= pow9;
                sum_num++;
            }
        }

        sum_num += N;

        System.out.println(sum_num);
    }
}
