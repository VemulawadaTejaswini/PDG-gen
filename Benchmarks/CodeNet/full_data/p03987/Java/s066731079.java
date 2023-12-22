import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] SRC = new int[N];
        for(int i = 0; i < N; i++) {
            SRC[i] = sc.nextInt();
        }
        long ans = 0;
        for(int i = 0; i < N; i++) {
            int a = SRC[i];
            int l = 0, r = 0;
            for(int j = i-1; j >= 0; j--) {
                if(SRC[j] < a) break;
                l++;
            }
            for(int j = i+1; j < N; j++) {
                if(SRC[j] < a) break;
                r++;
            }
            ans += (l+1) * (r+1) * a;
        }
        System.out.println(ans);
    }
}