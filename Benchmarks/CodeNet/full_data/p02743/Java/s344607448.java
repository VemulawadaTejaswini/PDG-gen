import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
        long c = scan.nextInt();
        System.out.println(c - a - b > 0 && 4 * a * b < (c - a - b) * (c - a - b) ? "Yes" : "No");
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
