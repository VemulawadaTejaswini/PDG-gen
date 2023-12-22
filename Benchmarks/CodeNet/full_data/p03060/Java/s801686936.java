import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        int[] b = new int[N];
        for(int i = 0; i<N; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i<N; i++) {
            b[i] = Integer.parseInt(sc.next());
            b[i] = a[i] - b[i];
        }
        Arrays.sort(b);
        int ans = 0;
        for(int i = 0; i<N; i++) {
            if(b[i] >0) ans += b[i];
        }
        System.out.println(ans);
    }
}