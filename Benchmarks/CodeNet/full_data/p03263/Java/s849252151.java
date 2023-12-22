import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        int[][] a = new int[h][w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                a[i][j] = sc.nextInt() % 2;
            }
        }
        int[] b = new int[h*w];
        int[] c = new int[h*w];
        int[] d = new int[h*w];
        int[] e = new int[h*w];
        int[] y = new int[h*w];
        int[] x = new int[h*w];
        int cnt = -1;
        for(int i = 0; i < h; i++){
            if(i % 2 == 0){
                for(int j = 0; j < w; j++){
                    ++cnt;
                    y[cnt] = i;
                    x[cnt] = j;  
                }
            }else{
                for(int j = w - 1; j >= 0; j--){
                    ++cnt;
                    y[cnt] = i;
                    x[cnt] = j;
                } 
            }
        }
        int ans = -1;
        for(int i = 0; i < cnt; i++){
            if(a[y[i]][x[i]] % 2 == 1){
                ans++;
                b[ans] = y[i] + 1;
                c[ans] = x[i] + 1;
                d[ans] = y[i+1] + 1;
                e[ans] = x[i+1] + 1;
                a[y[i+1]][x[i+1]]++;
            }
        }
        System.out.println(++ans);
        for(int i = 0; i < ans; i++){
            System.out.println(b[i] + " " + c[i] + " " + d[i] + " "  + e[i]);
        }
    }
}


