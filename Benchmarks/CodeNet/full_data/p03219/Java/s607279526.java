import java.util.*;

public class Main{
    
    void solve(){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(x + y / 2);
        scan.close();
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}