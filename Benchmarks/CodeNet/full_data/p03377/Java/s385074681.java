import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = scan.nextInt();
        System.out.println(a <= x && x <= b ? "YES" : "NO");
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}