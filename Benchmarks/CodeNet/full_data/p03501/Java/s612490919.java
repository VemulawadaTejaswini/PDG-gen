import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println((int)Math.min(b, a * n));
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
