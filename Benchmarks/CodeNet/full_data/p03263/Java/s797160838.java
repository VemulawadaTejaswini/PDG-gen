import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] a = new int[h][w];
        long cnt = 0;
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                a[i][j] = sc.nextInt() % 2;
                if(a[i][j] == 1){
                    cnt += h + w - i - j - 2;
                }
            }
        }
        System.out.println(cnt);
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(a[i][j] == 1){
                    for(int k = i; k < h - 1; k++){
                        System.out.println((k + 1) + " " + (j + 1) + " " + (k + 2) + " " + (j + 1));
                    }
                    for(int l = j; l < w - 1; l++){
                        System.out.println(h + " " + (l + 1) + " " + h + " " + (l + 2));
                    }
                }
            }
        }
    }
}