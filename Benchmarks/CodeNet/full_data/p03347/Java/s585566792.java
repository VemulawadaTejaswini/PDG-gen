import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        if(a[0] != 0){
            System.out.println(-1);
            return;
        }
        for(int i=0; i<n-1; i++){
            if(a[i+1]-1 > a[i]){
                System.out.println(-1);
                return;
            }
        }

        int ans = 0;

        for(int i=1; i<n-1; i++){
            if(a[i] >= a[i+1]){
                ans += a[i];
            }
        }
        ans += a[n-1];

        System.out.println(ans);
    }
}