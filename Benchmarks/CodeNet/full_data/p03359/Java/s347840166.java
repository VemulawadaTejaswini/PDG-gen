import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a <= b){
            System.out.println(a);
        }else{
            System.out.println(a - 1);
        }
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
