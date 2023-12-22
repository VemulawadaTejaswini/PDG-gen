import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++) a[i] = scan.nextInt();
        int out = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 == 0){
                out++;
                a[i] /= 2;
                i = -1;
            }
        }
        System.out.println(out);
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
