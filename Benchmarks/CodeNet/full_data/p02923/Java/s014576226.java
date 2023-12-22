import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = scan.nextInt();
        }
        int out = 0;
        int max = -1;
        for(int i = n - 1; i > 0; i--){
            if(h[i - 1] >= h[i]) out++;
            else {
                max = Math.max(max, out);
                out = 0;
            }
        }
        System.out.println(max);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}