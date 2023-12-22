import java.util.*;
public class Main{
    private static int gcd(int m, int n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        sc.close();
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                for(int k=1;k<n+1;k++){
                    ans += gcd(gcd(i,j),k);
                }
            }
        }
        System.out.println(ans);
    }
}