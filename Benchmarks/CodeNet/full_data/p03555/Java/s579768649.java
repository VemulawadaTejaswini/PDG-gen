import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        for(int i = 0; i < 3; i++){
            if(s.charAt(i) != t.charAt(2 - i)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
