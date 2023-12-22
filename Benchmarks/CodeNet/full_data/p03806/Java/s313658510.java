import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ma = sc.nextInt();
        int mb = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int sa = 0, sb = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            sa += a[i];
            sb += b[i];
        }
        int[][][] bl = new int[n][sa + 1][sb + 1];
        bl[0][a[0]][b[0]] = c[0];
        System.out.println(bl[0][a[0]][b[0]]);
        for(int i = 1; i < n; i++){
            for(int j = 1; j + a[i] <= sa; j++){
                for(int k = 1; k + b[i] <= sb; k++){
                    bl[i][j + a[i]][k + b[i]] = (bl[i-1][j][k] > 0) ? bl[i-1][j][k] + c[i] : 0;
                }
            }
        }
        int ans = 100000;
        for(int k = 0; k < n; k++){
            for(int i = 1; ma * i <= sa && mb * i <= sb; i++){
                if(bl[k][ma * i][mb * i] > 0){
                    ans = Math.min(ans, bl[k][ma * i][mb * i]);
                }
           }
        }
        if(ans == 100000) ans = -1;
        System.out.println(ans);
    }
}