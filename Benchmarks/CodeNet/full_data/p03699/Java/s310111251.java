import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] score = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            sum += score[i];
        }

        int[] sortSc = score;
        Arrays.sort(sortSc);

        for (int scr : sortSc) {
            if (sum % 10 != 0) {
                break;
            } else if (scr % 10 == 0) {
                continue;
            }
            sum -= scr;
        }

        if (sum % 10 == 0)
            sum = 0;

        System.out.println(sum);

    }
}
