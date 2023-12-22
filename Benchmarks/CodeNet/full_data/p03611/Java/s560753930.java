import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[100010];
        for(int i = 0; i < n; i++) num[scan.nextInt()]++;
        int out = 0;
        for(int i = 1; i < 100009; i++){
            out = Math.max(num[i - 1] + num[i] + num[i + 1], out);
        }
        System.out.println(out);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
