import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] h = new int[N];
        int[] a = new int[N];
        int cx = 0;
        int cy = 0;
        int H = 0;
        
        for(int i=0; i<N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        loop:for(int i=0; i<=100; i++){
            for(int j=0; j<=100; j++){
                for(int k=0; k<N; k++){
                    a[k] = h[k] + Math.abs(x[k] - i) + Math.abs(y[k] - j);
                    if(k>0){
                        if(a[k]!=a[k-1]){
                            break;
                        }
                    }
                    if(k==N-1){
                        cx = i;
                        cy = j;
                        H = a[k];
                        System.out.println(cx + " " + cy + " " + H);
                        break loop;
                    }
                }
            }
        }
    }
}