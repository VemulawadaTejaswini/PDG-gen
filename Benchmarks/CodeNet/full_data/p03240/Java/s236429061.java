import java.util.*;

public class Main {
    
    static int[] x;
    static int[] y;
    static int[] h;
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        x = new int[N];
        y = new int[N];
        h = new int[N];
        
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        long[] XYH = new long[3];
        for(int cx = 0; cx <= 100; cx++){
            for(int cy = 0; cy <= 100; cy++){
                int H = -1;
                boolean isOK = true;
                for(int i = 0; i < N; i++){
                    if( h[i] == 0 ) continue;
                    if( H == -1 ){
                        H = h[i] + Math.abs(cx - x[i]) + Math.abs(cy - y[i]);
                    } else {
                        if( H != h[i] + Math.abs(cx - x[i]) + Math.abs(cy - y[i]) ){
                            isOK = false;
                            break;
                        }
                    }
                }
                
                if( !isOK ) continue;
                
                for(int i = 0; i < N; i++){
                    if( h[i] == 0 && H > Math.abs(cx - x[i]) + Math.abs(cy - y[i]) ){
                        isOK = false;
                        break;
                    }
                }
                
                if( isOK ){
                    XYH[0] = cx;
                    XYH[1] = cy;
                    XYH[2] = H;
                    break;
                }
            }
        }        
        
        System.out.println( XYH[0] + " " + XYH[1] + " " + XYH[2] );
        
    }
}
