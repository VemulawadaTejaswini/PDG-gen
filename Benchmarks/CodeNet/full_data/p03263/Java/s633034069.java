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
        int cnt = -1;
        for(int i = 0; i < h; i++){
            if(i % 2 == 0){
                for(int j = 0; j < w-1; j++){
                    if(a[i][j] % 2 == 1){
                        cnt++;
                        b[cnt] = i+1;
                        c[cnt] = j+1;
                        d[cnt] = i+1;
                        e[cnt] = j+2;
                        a[i][j+1]++;
                    }
                }
                if(i == h-1) break;
                else if(a[i][w-1] % 2 == 1){
                    cnt++;
                    b[cnt] = i+1;
                    c[cnt] = w;
                    d[cnt] = i+2;
                    e[cnt] =w;
                    a[i+1][w-1]++;
                }
            }
            else{
                for(int j = w-1; j > 0; j--){
                    if(a[i][j] % 2 == 1){
                        cnt++;
                        b[cnt] = i+1;
                        c[cnt] = j+1;
                        d[cnt] = i+1;
                        e[cnt] = j;
                        a[i][j-1]++;
                    }
                }
                if(i == h-1) break;
                else if(a[i][0] % 2 == 1){
                    cnt++;
                    b[cnt] = i+1;
                    c[cnt] = 0;
                    d[cnt] = i+2;
                    e[cnt] = 0; 
                    a[i+1][0]++;
                }
            }
        }
        System.out.println(++cnt);
        for(int i = 0; i < cnt; i++){
            System.out.println(b[i] + " " + c[i] + " " + d[i] + " "  + e[i]);
        }
    }
}