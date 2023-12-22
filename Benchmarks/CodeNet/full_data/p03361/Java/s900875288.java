import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        char s[][] = new char[H][W];
        for(int i = 0; i < H; i++) {
            s[i] = sc.next().toCharArray();
        }
        
        boolean isAllOK = true;
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                if( s[i][j] == '.' ) continue;
                
                boolean isOK = false;
                if( 0 <= i-1 && s[i-1][j] == '#' ) {
                    isOK = true;
                }
                if( i+1 < H && s[i+1][j] == '#' ) {
                    isOK = true;
                }
                if( 0 <= j-1 && s[i][j-1] == '#' ) {
                    isOK = true;
                }
                if( j+1 < W && s[i][j+1] == '#' ) {
                    isOK = true;
                }
                
                if( !isOK ) {
                    isAllOK = false;
                }
            }
        }
        
        System.out.println( (isAllOK) ? "Yes" : "No" );
    }
}
