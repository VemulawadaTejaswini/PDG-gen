import java.util.*;

public class Main {

    static Scanner in = new Scanner(System.in);
    void solve() {
        int n = in.nextInt();
        for(int i = 40000; i > 1; i--){
            if(i * i <= n){
                System.out.println(i * i);
                return;
            }
        }
        System.out.println(1);
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}