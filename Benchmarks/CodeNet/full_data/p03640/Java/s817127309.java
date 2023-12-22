import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        String[][] ans = new String[h][w];
        int[] color = new int[n];
        for(int i = 0; i < n; i++){
            color[i] = sc.nextInt();
        }
        boolean isReverse = false;
        int nowx = 0;
        int nowy = 0;
        for(int i = 0; i < n; i++){
            while(color[i] > 0){
                ans[nowy][nowx] = String.valueOf((i+1));
                color[i]--;
                if(isReverse){
                    if(nowx == 0){
                        nowy++;
                        isReverse = false;
                    }else{
                        nowx--;
                    }
                }else{
                    if(nowx == w-1){
                        nowy++;
                        isReverse = true;
                    }else{
                        nowx++;
                    }
                }
            }
        }
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}