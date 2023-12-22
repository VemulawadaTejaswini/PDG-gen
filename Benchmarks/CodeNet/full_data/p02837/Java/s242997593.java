import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    static int n;
    static int ans;
    static int[][] axy;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = Integer.parseInt(sc.next());
        
        ans = 0;
        axy = new int[n+1][n+1];
        
        for(int i = 1; i <= n; i++){
            Arrays.fill(axy[i], -1);
            int a = Integer.parseInt(sc.next());
            for(int j = 0; j < a; j++){
                int x = Integer.parseInt(sc.next());
                int y = Integer.parseInt(sc.next());
                axy[i][x] = y;
            }
        }
        
        makeCombination(n);
        System.out.println(ans);
    }
    
    static void makeCombination(int n){
        
        int[] s = new int[n];
        for(int i = 0; i < s.length; i++){
            s[i] = 0;
        }
        rec(s, 0);
    }
    
    static void rec(int[] s, int i){
        
        if(i == s.length){
            int[] y = new int[n+1];
            Arrays.fill(y, -1);
            for(int j = 1; j <= s.length; j++){
                y[j] = s[j-1];
            }
            for(int j = 1; j <= s.length; j++){
                if(s[j-1] == 1){
                    for(int k = 1; k <= n; k++){
                        if(axy[j][k] == 0 && y[k] == 1){
                            return;
                        }else if(axy[j][k] == 1 && y[k] == 0){
                            return;
                        }else if(axy[j][k] != -1){
                            y[k] = axy[j][k];
                        }
                    }
                }
            }
            
            int count = 0;
            for(int j = 0; j < s.length; j++){
                if(s[j] == 1) count++;
            }
            if(count > ans) ans = count;
            return;
        }
        
        rec(s, i+1);
        s[i] = 1;
        rec(s, i+1);
        s[i] = 0;
    }
}