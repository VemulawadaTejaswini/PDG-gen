import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            a[i] = sc.nextInt();
            // System.out.println(a[i]);
        }

        int ans[] = new int[n + 1];
        int count = 0;
        for (int i = n; i > 0; i--) {
            int need = a[i];
            int wa = 0;
            for (int j = 1; j * i < n; j++) {
                wa += ans[i * j];
            }
            int mod = wa % 2;
            if (mod == need) {
                ans[i] = 0;
            } else {
                ans[i] = 1;
                count++;
            }
        }
        System.out.println(count);
        for (int i = 1; i < n + 1; i++) {
            if (ans[i] != 0) {
                System.out.println(i);
                System.out.print(" ");
            }
        }
        System.out.println("");

        sc.close();
    }
}
