import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        long sum[] = new long[n+1];
        sum[n] = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
            if(i==0){
                sum[0] = a[0];
            }else{
                sum[i] = sum[i-1] + a[i];
            }
        }
        sc.close();

        Arrays.sort(sum);

        long ans = 0;

        int same = 1;
        for(int i=1; i<n+1; i++){
            if(sum[i] == sum[i-1]){
                same++;
            }else{
                if(same > 1){
                    ans += same * (same-1) / 2;
                    same = 1;
                }
            }
        }
        if(same > 1){
            ans += same * (same-1) / 2;
        }

        System.out.println(ans);

    }
}