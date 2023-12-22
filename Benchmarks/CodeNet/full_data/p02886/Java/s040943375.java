import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int d[] = new int[n];
        for(int i=0;i<n;i++)d[i]=sc.nextInt();

        for(int i=0;i<n-1;i++)for(int j=i+1;j<n;j++)ans += d[i]*d[j];
        System.out.println(ans);

    }

}
