import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] min_p = new int[n];
        int counter = 0;
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int m = p[i];
            for (int j = i; j >= 0; j--) {
                if (p[j] <= m) {
                    m = p[j];
                }
            }
            min_p[i] = m;
            if (p[i] == min_p[i]) {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}