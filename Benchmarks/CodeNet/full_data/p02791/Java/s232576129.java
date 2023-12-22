import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (min >= a[i]) {
                min = a[i];
                count++;
            } else {
            }
        }
        System.out.println(count);
        sc.close();
    }
}
