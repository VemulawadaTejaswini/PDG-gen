import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean div2 = true;
        int cnt = 0;
        while (true) {
            div2 = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0 && !div2) {
                    div2 = true;
                    arr[i] /= 2;
                } else {
                    arr[i] *= 3;
                }
            }
            if (div2)
                cnt += 1;
            else
                break;
        }
        System.out.println(cnt);
    }
}
