import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a = new int[N];
        long sum = 0;
        int plus = 0;
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            if(a[i]>=0) plus++;
            sum += Math.abs(a[i]);
        }
        sc.close();

        Arrays.sort(a);
        long ans = sum;
        if(plus == N)
            ans -= 2*a[0];
        else if(plus == N)
            ans += 2*a[N-1];
        System.out.println(ans);
        if(plus == N) plus--;
        if(plus == 0) plus++;
        int xy = a[N-1];
        for(int i = 1; i < N-plus; i++){
            System.out.println(xy + " " + a[i]);
            xy = xy - a[i];
        }
        int yx = a[0];
        for(int i = N-2; i >= N-plus; i--){
            System.out.println(yx + " " + a[i]);
            yx = yx - a[i];
        }
        System.out.println(xy + " " + yx);
    }
}