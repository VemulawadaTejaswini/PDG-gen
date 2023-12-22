import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    public static void main(String argv[]) {
        Scanner cin = new Scanner(System.in);
        final int MX = 170*80;
        int h = cin.nextInt();
        int w = cin.nextInt();
        int[][] a = new int[h][w];
        int[][] b = new int[h][w];
        Boolean[][][] c = new Boolean[h][w][MX];
        IntStream.range(0, h).forEach(i->{
            IntStream.range(0, w).forEach(j->{
                Arrays.fill(c[i][j], false);
            });
        });
        IntStream.range(0, h).forEach(i->{
            IntStream.range(0, w).forEach(j->{
                a[i][j] = cin.nextInt();
            });
        });
        IntStream.range(0, h).forEach(i->{
            IntStream.range(0, w).forEach(j->{
                b[i][j] = cin.nextInt();
            });
        });
        IntStream.range(0, h).forEach(i->{
            IntStream.range(0, w).forEach(j->{
                IntStream.range(0, MX).forEach(k->{
                    int d = Math.abs(a[i][j]-b[i][j]);
                    if (i>0 && c[i-1][j][k] || i==0 && k==0) {
                        c[i][j][k+d] = true;
                        c[i][j][Math.abs(k-d)] = true;
                    }
                    if (j>0 && c[i][j-1][k] || j==0 && k==0) {
                        c[i][j][k+d] = true;
                        c[i][j][Math.abs(k-d)] = true;
                    }
                });
            });
        });
        long answer = Arrays.stream(c[h-1][w-1]).takeWhile(e->!e).count();
        System.out.println(answer);
    }
}
