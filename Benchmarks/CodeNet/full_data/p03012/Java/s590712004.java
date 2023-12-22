import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n+1];
        w[0]=0;
        for (int i=0;i<n;i++)w[i+1]=w[i]+sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i=1;i<n;i++)ans=Math.min(ans,Math.abs(w[n]-2*w[i]));
        System.out.println(ans);
    }
}
