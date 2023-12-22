import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=n;i+=2){
            if(div(i)==8)ans++;
        }
        System.out.println(ans);
    }
    private static int div(int n){
        int ans = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0)ans++;
        }
        return ans;
    }


}
