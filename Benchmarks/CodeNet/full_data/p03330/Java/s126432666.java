import java.util.Scanner;

public class Main {
    public static int[][] cArray;
    public static int[][] dArray;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        cArray = new int[n][n];
        dArray = new int[c][c];
        for(int y = 0;y < c;++y){
            for (int x = 0;x < c;++x){
                dArray[x][y] = sc.nextInt();
            }
        }
        for(int y = 0;y < n;++y){
            for (int x = 0;x < n;++x){
                cArray[x][y] = sc.nextInt();
            }
        }
        search(n,c);
    }

    public static void search(int n,int c){
        long min = Long.MAX_VALUE;
        for (int c1 = 1;c1 <= c;++c1){
            for (int c2 = 1;c2 <= c;++c2){
                if(c2 == c1)continue;
                for (int c3 = 1;c3 <= c;++c3){
                    if(c1 == c3||c2 == c3)continue;
                    int sf = 2;
                    int sfc = c2;
                    long k = 0;
                    for (int i = 2;i <= n * 2;++i){
                        for (int x = i - 1 > n ? i - n : 1;x < i&&x <= n;++x){
                            int y = i - x;
                            k += dArray[sfc - 1][cArray[x - 1][y - 1] - 1];
                        }
                        switch (sf){
                            case 1:sf = 2;sfc = c2;break;
                            case 2:sf = 3;sfc = c3;break;
                            case 3:sf = 1;sfc = c1;break;
                        }
                    }
                    if(min > k){
                        min = k;
                    }
                }
            }
        }
        System.out.println(min);
    }

}
