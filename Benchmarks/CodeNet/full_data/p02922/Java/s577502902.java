import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(b == 1) System.out.println(0);
        else if(b <= a) System.out.println(1);
        else{
            b -= a;
            System.out.println(1 + b / (a - 1) + b % (a - 1));
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
