import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[2];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        Arrays.sort(a);
        int ans = 3;
        if (a[0] != 1) {
            ans = 1;
        } else if (a[1] != 2) {
            ans = 2;
        }
        System.out.println(ans);
        sc.close();
    }
}
