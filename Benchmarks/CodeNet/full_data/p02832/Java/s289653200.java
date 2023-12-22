import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int serch = 1;
        int breakk = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == serch) {
                serch++;
            } else {
                breakk++;
            }
        }
        if (serch == 1) {
            breakk = -1;
        }
        System.out.println(breakk);
        sc.close();
    }
}
