import java.util.Scanner;


// 139_c
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] h = new int[n];
        int tmp_count = 0;
        int total_count = 0;
        for (int i = 0; i < n; i++) {
            h[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (h[j - 1] >= h[j]) {
                    tmp_count++;
                } else {
                    break;
                }
            }
            if (tmp_count > total_count) {
                total_count = tmp_count;
            }
            if (total_count > n - i) {
                break;
            }
            tmp_count = 0;

        }

        System.out.println(total_count);

    }

}
