import java.util.*;

public class Main{
    
    public static Scanner sc;
    public static int n;
    
    public static void main(String[] args){
        sc = new Scanner(System.in);
        
        final int INF = 1_000_000_000;
        
        n = sc.nextInt();
        
        char[][] grd = new char[n][];
        
        for(int i=0; i<n; i++){
            String line = sc.next();
            grd[i] = line.toCharArray();
        }
        
        int ans = 0;
        for(int i=0; i<n; i++){
            boolean res = check(grd, i);
            ans += (res)? n : 0;
        }
        
        System.out.println(ans);
    }
    
    public static boolean check(char[][] grd, int a){
        char[][] newgrd = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                newgrd[i][j] = grd[(i+a)%n][j];
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(newgrd[i][j] != newgrd[j][i]){
                    return false;
                }
            }
        }
        
        return true;
    }
}
