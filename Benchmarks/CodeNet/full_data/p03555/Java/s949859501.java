import java.util.*;
 
public class Main {
 
    static Scanner in = new Scanner(System.in);
    void solve() {
        String s = in.nextLine(), t = in.nextLine();
        if(s.charAt(0) == t.charAt(2) && s.charAt(1) == t.charAt(1) && s.charAt(2) == t.charAt(0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
 
    public static void main(String[] args) {
        new Main().solve();
    }
}