import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean flag = true;
        int count = 0;
        while (flag) {
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    a[i] = a[i] / 2;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
    }
}