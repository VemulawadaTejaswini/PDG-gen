import java.util.*;
import static java.lang.Math.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m+1];
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            for(int j=0; j<num; j++){
                int t = sc.nextInt();
                a[t]++;
            }
        }
        int ans = 0;
        for(int i=0; i<=m; i++){
            if(a[i] == n){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
