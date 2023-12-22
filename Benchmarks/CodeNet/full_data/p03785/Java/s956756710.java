import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        int k = scan.nextInt();
        int[] t = new int[n];
        for(int i = 0; i < n; i++) t[i] = scan.nextInt();
        Arrays.sort(t);
        int count = 1;
        int cval = t[0] + k;
        int out = 1;
        for(int i = 1; i < n; i++){
            if(cval >= t[i] && count + 1 <= c){
                count++;
            }else{
                out++;
                count = 1;
                cval = t[i] + k;
            }
        }
        System.out.println(out);
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
