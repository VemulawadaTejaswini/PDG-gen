import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N];
        int max = 0;
        int ans = 0;
        for(int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
            ans += p[i];
            if(max < p[i]) max = p[i];
        }
        ans -= max/2;
        System.out.println(ans);
    }
}