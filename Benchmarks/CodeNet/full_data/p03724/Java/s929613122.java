import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] cnt = new int[N];
        for (int i=0;i<M;i++) {
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            cnt[a]++;
            cnt[b]++;
        }
        for (int i=0;i<N;i++) {
            if (cnt[i]%2==1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        return;
    }
}