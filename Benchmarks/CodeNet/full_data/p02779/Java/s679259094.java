import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean judge = true;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    continue;
                }
                if (a[i] == a[j]) {
                    judge = false;
                    break;
                }
            }
            if (!judge) {
                break;
            }
        }
        if (judge) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}