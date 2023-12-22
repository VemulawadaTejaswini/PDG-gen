import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        main.solve();
    }
    void solve(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i=0;i<N;i++) a[i]=sc.nextInt();
        int nextValue = 1, ans = 0;
        for(int i=0;i<N;i++){
            if(a[i]==nextValue){
                nextValue += 1;
                ans += 1;
            }
        }
        if(ans==0) ans = -1;
        else ans = N-ans;
        System.out.println(ans);
    }
}
