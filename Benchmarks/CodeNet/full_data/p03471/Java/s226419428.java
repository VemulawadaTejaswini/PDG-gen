import java.util.*;

class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int y = scan.nextInt();
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                int z = (y - i * 10000 - j * 5000) / 1000;
                if(z == n - i - j && 0 <= z && z <= n){
                    System.out.println(i + " " + j + " " + z);
                    return;
                }
            }
        }
        System.out.println(-1 + " " + -1 + " " + -1);
        scan.close();
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
