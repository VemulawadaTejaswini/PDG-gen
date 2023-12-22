import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        scanner.close();
        int[] sa = new int[n];
        for (int i = 0; i < n; i++) {
            sa[i] = a[i] - b[i];
        }
        Arrays.sort(sa);
        int countOfhu = 0;
        int amountOfhu = 0;
        for (int i = 0; i < n; i++) {
            if (sa[i] < 0) {
                countOfhu++;
                amountOfhu += sa[i];
            }
        }
        if (countOfhu == 0) {
            System.out.println(0);
            return;
        }

        int genjitendenosei_count = 0;
        int genjitendenosei_amount = 0;

        for (int i = 0; i < sa.length - countOfhu; i++) {
            genjitendenosei_amount += sa[sa.length - i - 1];
            genjitendenosei_count++;
            if (genjitendenosei_amount > amountOfhu * -1) {
                System.out.println(genjitendenosei_count + countOfhu);
                return;
            }
        }
        System.out.println(-1);
    }

}
