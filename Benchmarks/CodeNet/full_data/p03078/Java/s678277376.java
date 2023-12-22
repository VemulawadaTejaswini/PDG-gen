import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[x];
        long[] b = new long[y];
        long[] c = new long[z];
        for (int i = 0; i < x; i++) a[i] = sc.nextLong();
        for (int i = 0; i < y; i++) b[i] = sc.nextLong();
        for (int i = 0; i < z; i++) c[i] = sc.nextLong();
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        long[] sum = new long[100000];
        int cnt = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int l = 0; l < z; l++) {
                    if((i+1)*(j+1)*(l+1) >3000) break;
                    sum[cnt++] = a[x-1-i] + b[y-1-j] + c[z-1-l];
                }
            }
        }
        Arrays.sort(sum);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < k; i++) {
            ans.append(sum[sum.length -1 - i] + "\n");
        }

        System.out.println(ans);
        sc.close();
    }

}
