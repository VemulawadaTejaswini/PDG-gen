import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int h = 100;
        int w = 100;
        
        final int WHITE = 0;
        final int BLACK = 1;
        
        int[][] grd = new int[h][w];
        
        for(int i=0; i<h/2; i++){
            for(int j=0; j<w; j++){
                grd[i][j] = BLACK;
            }
        }
        
        for(int i=0; i<a-1; i++){
            int y = i*2/w;
            int x = i*2%w + y%2;
            grd[y][x] = WHITE;
        }
        
        for(int i=0; i<b-1; i++){
            int y = h - i*2/w - 1;
            int x = w - i*2%w - 1 - y%2;
            grd[y][x] = BLACK;
        }
        
        System.out.println(h + " " + w);
        
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                System.out.print((grd[i][j]==WHITE)? '.' : '#');
            }
            System.out.println("");
        }
    }
}
