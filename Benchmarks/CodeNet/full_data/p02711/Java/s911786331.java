import java.util.*;

class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        boolean out = n.charAt(0) == '7' || n.charAt(1) == '7' || n.charAt(2) == '7';
        System.out.println(out ? "Yes" : "No");
        scan.close();
    }
    public static void main(String[] args){
        new Main().solve();
    }
}
