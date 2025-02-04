import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] c = new char[h][w];
        
        for(int i=0; i<h; i++){
            String  s = sc.next();
            for(int j=0; j<w; j++){
                c[i][j] = s.charAt(j);
            }
        }
        
        for(int i=0; i<h; i++){
            int flg = 0;
            for(int j=0; j<w; j++){
                if(c[i][j]=='#'){
                    flg = 1;
                }
            }
            if(flg == 0){
                for(int j=0; j<w; j++){
                    c[i][j]='0';
                }
            }
        }
        
        for(int j=0; j<w; j++){
            int flg = 0;
            for(int i=0; i<h; i++){
                if(c[i][j]=='#' || c[i][j]=='0'){
                    flg = 1;
                }
            }
            if(flg == 0){
                for(int i=0; i<h; i++){
                    c[i][j]='0';
                }
            }
        }
        
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(c[i][j]!='0'){
                    System.out.print(c[i][j]);
                    if(j==w-1){
                        System.out.println();
                    }
                }
            }
            
        }
    }
}
