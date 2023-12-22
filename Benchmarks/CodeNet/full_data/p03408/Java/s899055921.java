import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; i++) s[i] = scan.next();
        int m = scan.nextInt();
        String[] t = new String[m];
        for(int i = 0; i < m; i++) t[i] = scan.next();
        int max = 0;
        for(int i = 0; i < n; i++){
            int out = 0;
            for(int j = 0; j < n; j++){
                if(s[i].equals(s[j])) out++;
            }
            for(int j = 0; j < m; j++){
                if(s[i].equals(t[j])) out--;
            }
            max = Math.max(max, out);
        }
        System.out.println(max);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}