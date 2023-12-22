import java.util.*;

class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long out = 0;
        for(int i = 1; i <= n; i++){
            if(i % 3 != 0 && i % 5 != 0) out += i;
        }
        System.out.println(out);
        scan.close();
    }
    public static void main(String[] args){
        new Main().solve();
    }
}
