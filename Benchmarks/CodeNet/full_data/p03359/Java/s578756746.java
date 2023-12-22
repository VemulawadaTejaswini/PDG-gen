import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b=sc.nextInt();
        int ans = 0;
        for(int i=1;i<13;i++){
            if(i<=a&&i<=b) ans++;
        }
        System.out.println(ans);
    }
}
