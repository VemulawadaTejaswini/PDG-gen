import java.util.*;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    static int H = Integer.parseInt(sc.next());
    static int W = Integer.parseInt(sc.next());
        
    public static void main(String[] args) {
        
        long[][] hyo = new long[H][W];
        String line;
        String[] sp;
        
        for(int i = 0; i < H; i++) {
            line = sc.next();
            sp = line.split("");
            for(int j = 0; j < W; j++) {
                if(sp[j].equals(".")) {
                    hyo[i][j] = 0;
                }else {
                    hyo[i][j] = -1;
                }
            }
        }
        
        for(int j = 0; j < W; j++) {
            if(hyo[0][j] == -1) {
                break;
            }else {
                hyo[0][j] = 1;
            }
        }
        
        for(int i = 0; i < H; i++) {
            if(hyo[i][0] == -1) {
                break;
            }else {
                hyo[i][0] = 1;
            }
        }
        
        
        for(int i = 1; i < H; i++) {
            for(int j = 1; j < W; j++) {
                if(hyo[i][j] == -1) {
                    continue;
                }else if(hyo[i-1][j] == -1 && hyo[i][j-1] == -1) {
                    continue;
                }else if(hyo[i-1][j] == -1 || hyo[i][j-1] == -1) {
                    hyo[i][j] = max(hyo[i-1][j], hyo[i][j-1]) % 1000000007;
                }else {
                    hyo[i][j] = hyo[i-1][j] + hyo[i][j-1] % 1000000007;
                }
                
            }
        }
        
        
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                System.out.print(hyo[i][j]+" ");
            }
            System.out.println("");
        }
        
        
        System.out.println(hyo[H-1][W-1]);
        
    }

    
    public static long max(long a, long b) {
        if(a >= b) {
            return a;
        }else {
            return b;
        }
    }
    
    public static int max(int a, int b) {
        if(a >= b) {
            return a;
        }else {
            return b;
        }
    }
    
    public static long min(long a, long b) {
        if(a >= b) {
            return b;
        }else {
            return a;
        }
    }
    
    public static int min(int a, int b) {
        if(a >= b) {
            return b;
        }else {
            return a;
        }
    }
}