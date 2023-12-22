import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long cnt = 1;
        long mod = 1000000007;

        for(int i =1;i<=n;i++){
            cnt=(cnt*i)%mod;
        }
        System.out.println(cnt);
    }
}




