import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int ans = 0;
        for (int i = 0; i <= k; i++) {
            if(i == s) {
                ans++;
                break;
            }
            for (int j = 0; j <= k; j++) {
                if(i + j == s) {
                    ans++;
                    break;
                }
                for (int l = 0; l <= k; l++) {
                    if(i + j + l == s) {
                        ans++;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}