import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int[] b = new int[m];
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }
        int count = 0;

        for (int i = 0; i < n; i++) {
            int add = 0;
            for (int j = 0; j < m; j++) {
                int[] a = new int[m];
                a[j] = sc.nextInt();
                add += a[j] * b[j];
            }
            if (add + c > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
