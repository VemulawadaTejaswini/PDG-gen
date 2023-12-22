import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] num = new Integer[n];
        for (int i = 0; i < m; i++) {
            sc.nextLine();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (num[a-1] == null || b > num[a-1]) {
                num[a-1] = b;
            }
        }
        if (num[0] == null || (n != 1 && num[0] == 0)) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(num[i] != null ? num[i] : 0);
            }
            System.out.println();
        }
    }
}
