import java.util.*;

class out {
    static void put(int[][] n, int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(n[i][j]);
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int w = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int ans[][] = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans[i][j] = 1;
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                ans[i][j] = 0;
            }
        }
        int tmp=0;
        int tmp2=0;
        int check=0;
        int check2=0;
        boolean c1=false;
        boolean c2=false;

        for (int i = 0; i < h - 1; i++) {

            for (int j = h - 1; i < j; j--) {
                if (ans[i][j - 1] > ans[i][j]) {
                    tmp = ans[i][j - 1];
                    ans[i][j - 1] = ans[i][j];
                    ans[i][j] = tmp;
                }
                if (ans[j-1][i] > ans[j][i]) {
                    tmp = ans[j - 1][i];
                    ans[j - 1][i] = ans[j][i];
                    ans[j][i] = tmp;
                }
               r: for (int k = 0; k < h - 1; k++) {
                    for (int l = 0; l < w - 1; l++) {
                        check += ans[k][l];
                    }
                    if(check==b || (w%2==1&&check==b-1)){
                        c1=true;
                        break ;
                    }
                    check=0;
                }
             l:  for (int m = 0; m < h - 1; m++) {
                    for (int n = 0; n < w - 1; n++) {
                        check2 += ans[n][m];
                    }
                    if((h%2==1&&check2==a-1)||check2==a){
                        c2=true;
                        break ;
                    }
                    check2=0;
                }
                out.put(ans, h, w);
                System.out.print(c1);
                System.out.println(c2);
                if (c1&&c2) {
                    out.put(ans, h, w);
                    System.exit(0);
                }
            }
            c1=false;
            c2=false;
            check=0;
            check2=0;
        }
        System.out.print("No");
    }
}
