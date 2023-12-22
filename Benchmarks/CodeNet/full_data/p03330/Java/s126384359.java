import java.util.Random;
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
       // genre(n,c);
        search(n,c);
    }

    public static void genre(int n,int c){
        Random random = new Random();
        for(int y = 0;y < c;++y){
            for (int x = 0;x < c;++x){
                if(x == y)continue;
                dArray[x][y] = random.nextInt(1000);
            }
        }
        for(int y = 0;y < n;++y){
            for (int x = 0;x < n;++x){
                cArray[x][y] = random.nextInt(c) + 1;
            }
        }
    }

    public static void search(int n,int c){
        int cc[][] = new int[3][c];
        int s = 2;
        for (int x = 0;x < n;++x){
            s = (x + 2) % 3;
            for (int y = 0;y < n;++y){
                ++cc[s][cArray[x][y] - 1];
                ++s;
                if(s == 3)s = 0;
            }
        }

        long min = Long.MAX_VALUE;
        for (int c1 = 1;c1 <= c;++c1) {
            for (int c2 = 1; c2 <= c; ++c2) {
                if (c2 == c1) continue;
                for (int c3 = 1; c3 <= c; ++c3) {
                    if (c1 == c3 || c2 == c3) continue;
                    long k = 0;
                    for (int nn = 0;nn < c;++nn){
                        k += dArray[c3 - 1][nn] * cc[0][nn];
                        k += dArray[c1 - 1][nn] * cc[1][nn];
                        k += dArray[c2 - 1][nn] * cc[2][nn];
                    }
                    if(min > k)min = k;
                }
            }
        }


        System.out.println(min);
    }

}
