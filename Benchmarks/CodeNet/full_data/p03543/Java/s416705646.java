import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)) count++;
        }
        System.out.println(count >= 3 ? "Yes" : "No");
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
