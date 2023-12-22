import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC148D - xxxxx

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        int cnt = 0;
        int idx = 0;
        boolean isOK = true;
        for (int i = 0; i < n; i++) {
            if (!isOK) {
                ans = -1;
                break;
            }
            if (n == idx) break;
            isOK = false;
            for (int j = idx; j < n; j++) {
                if (a[j] == i + 1) {
                    idx = j + 1;
                    isOK = true;
                    break;
                } else {
                    ans++;
                }
            }
        }
        
        if (ans == n) ans = -1;
        
        
        System.out.println(ans);
    }
}