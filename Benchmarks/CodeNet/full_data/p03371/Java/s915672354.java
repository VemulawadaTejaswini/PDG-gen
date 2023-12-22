import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int out = Integer.MAX_VALUE;
        for(int i = 0; i <= 100000; i++){
            out = Math.min(out, 2 * i * c + a * Math.max(0, (x - i)) + b * Math.max(0, (y - i)));
        }
        System.out.println(out);
    }


    public static void main(String[] args){
        new Main().solve();
    }
}
