import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long m = sc.nextInt();
        long ans = 0;

        if(n * 2 <= m){
            ans += n;
            m -= n * 2;
            ans += m / 4;
        }else{
            ans += m / 2;

        }

        System.out.println(ans);
    }
}
