import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[N];

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }
        
        long ans = 0;
        if(a[0]>x){
            ans += a[0] - x;
            a[0] = x;
        }
        for(int i=0; i<N-1; i++){
            if(a[i]+a[i+1]>x){
                ans += a[i] + a[i + 1] - x;
                a[i + 1] = x - a[i];
            }
        }
        System.out.println(ans);
    }
}