import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        D2[] red = new D2[n];
        D2[] blue = new D2[n];
        for (int i = 0;i < n;++i){
            red[i] = new D2(sc.nextInt(),sc.nextInt());
        }
        for (int i = 0;i < n;++i){
            blue[i] = new D2(sc.nextInt(),sc.nextInt());
        }
        boolean[][] select = new boolean[n][n];
        for (int i = 0;i < red.length;++i){
            for (int j = 0;j < blue.length;++j){
                if(red[i].x < blue[j].x&&red[i].y < blue[j].y)select[i][j] = true;
            }
        }
        System.out.println(search(select,n));

    }

    public static int search(boolean[][] select,int n){
        int max = -1;
        for (int i = 0;i < n;++i){
            for (int j = 0;j < n;++j){
                if(select[i][j]){
                    boolean[][] selectv = select.clone();
                    for (int k = 0;k < n;++k){
                        selectv[i][k] = false;
                        selectv[k][j] = false;
                    }
                    int k = search(selectv,n);
                    if(k > max)max = k;
                }
            }
        }
        return max + 1;
    }


    static class D2{
        public int x,y;
        public D2(int x,int y){
            this.x = x;this.y = y;
        }
    }

}