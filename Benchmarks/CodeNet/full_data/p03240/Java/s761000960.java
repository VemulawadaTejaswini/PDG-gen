import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        long[] h = new long[N];
        
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextLong();
        }

        boolean bl = false;
        int ansx = 0;
        int ansy = 0;
        long ansh = 0;
        for(int xx = 0; xx <= 100; xx++){
            for(int yy = 0; yy <= 100; yy++){
                bl = true;
                long hh = h[0] + Math.abs(xx - x[0]) + Math.abs(yy - y[0]);
                for(int i = 1; i < N; i++){
                    if(hh != (long) (h[i] + Math.abs(xx - x[i]) + Math.abs(yy - y[i]))){
                        bl = false;
                    }
                }
                if(bl == true){
                    ansx = xx;
                    ansy = yy;
                    ansh = hh;
                }
            }
        }

        System.out.println(ansx + " " + ansy + " " + ansh);
    }
}