import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        for(int i = 0; i < n; i++) scan.nextInt();
        System.out.println(n / k + n % k);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
