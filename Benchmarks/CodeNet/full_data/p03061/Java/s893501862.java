import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for(int i = 0; i<N; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        if(N==2) {
            System.out.println(Math.max(a[0],a[1]));
            return;
        }
        int ans = 0;
        int zantei = Integer.MIN_VALUE;
        int gcda = 0;
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N; j++) {
                if(j==i) continue;
                if(j==0 ||(i==0&&j==1)) {
                    gcda = a[j];
                    continue;
                }
                gcda = gcd(gcda,a[j]);
                if(gcda<=zantei) break;
            }
            zantei = Math.max(gcda,zantei);
        }


        System.out.println(zantei);
    }
    public static int gcd(int a, int b) {
        if(b==0)return a;
        return gcd(b, a%b);
    }
}