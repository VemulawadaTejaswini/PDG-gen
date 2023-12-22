import java.util.*;

public class Main {
    void solve(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.print(2018);
        for(int i = 4; i < s.length(); i++) System.out.print(s.charAt(i));
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
