import java.util.*;

public class Main {
    static int n, k;
    static int[] a;
    static int modP = 1000000007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i++) a[i] = in.nextInt();

        int minId = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] == 1) {
                minId = i;
            }
        }

        int leftHalfLen = minId + 1;
        int rightHalfLen = n - minId;
        int ans = 0;
        if(leftHalfLen+1 < n) {
            while(leftHalfLen > 1) {
                leftHalfLen -= k-1;
                ans++;
            }
        }else{
           ans++;
           rightHalfLen -= (k - rightHalfLen - 1);
        }


        while(rightHalfLen > 1) {
            rightHalfLen -= k-1;
            ans++;
        }


        System.out.println(ans);
    }
}

class P {
    int x, y;
    P(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class E {
    int l, r, d;
    E(int l, int r, int d) {
        this.l = l;
        this.r = r;
        this.d = d;
    }
}