import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        System.out.println(Math.max(0, scan.nextInt() - scan.nextInt()));
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
