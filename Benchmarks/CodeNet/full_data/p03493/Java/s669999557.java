import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int out = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1') out++;
        }
        System.out.println(out);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
