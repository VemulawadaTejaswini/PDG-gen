import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] d = new int[k];
        for(int i=0; i<k;i++) {
            d[i] = sc.nextInt();
        }
        
        for(int _q =0; _q <q; _q++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int m = sc.nextInt();
            int aj_0 = x;
            int ans = 0;
            for(int j=1; j<n; j++) {
                int aj_1 = aj_0;
                aj_0 = aj_1 + d[j % k];
                if((aj_1 % m) < (aj_0 % m)) {
                    ans++;
                }
            }
            
            System.out.println(ans);
        }

    }

}
