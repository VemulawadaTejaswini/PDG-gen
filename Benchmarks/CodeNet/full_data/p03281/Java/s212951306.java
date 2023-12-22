import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int out = 0;
        for(int i = 1; i <= n; i += 2){
            if(f(i) == 8) out++;
        }
        System.out.println(out);
    }

    int f(int n){
        if(n == 1) return 1;
        int ret = 2;
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0) ret += 2;
        }
        if(n % Math.sqrt(n) == 0) ret++;
        return ret;
    }


    public static void main(String[] args){
        new Main().solve();
    }
}
