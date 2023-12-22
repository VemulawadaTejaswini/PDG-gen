import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Integer[] d = new Integer[n];

        for (int i = 0; i < n; i++) {
            d[i] = Integer.parseInt(scan.nextLine());
        }
        Arrays.sort(d);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || d[i] > d[i - 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}