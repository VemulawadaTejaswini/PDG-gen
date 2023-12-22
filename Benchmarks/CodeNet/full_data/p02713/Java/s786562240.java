import java.util.*;

class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int out = 0;
        for(int a = 1; a <= k; a++){
            for(int b = 1; b <= k; b++){
                for(int c = 1; c <= k; c++){
                    out += gcd(gcd(a, b), c);
                }
            }
        }
        System.out.println(out);
        scan.close();
    }
    
    int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
