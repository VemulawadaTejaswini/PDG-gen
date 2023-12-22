import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int [][] table = new int[401][401];
        int [][] item = new int[401][401];
        int n = in.nextInt();
        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int [][] shops = new int[n][3];
        for(int i=0;i<n;i++){
            shops[i][0] = in.nextInt();
            shops[i][1]= in.nextInt();
            shops[i][2] = in.nextInt();
            table[shops[i][0]][shops[i][1]] = shops[i][2];
        }
        for(int i=0;i<n;i++){
            int r= shops[i][0];
            int c= shops[i][1];
                for(int j = 1; j <=400; j++) {
                    for(int k = 1; k <=400; k++) {
                        if(table[j][k]!=0 && (j!=r || k!=c) && item[j][k]<=i){
                            int row = r+j;
                            int col = c+k;
                            int cost = shops[i][2]+table[j][k];
                            if(table[row][col]==0){
                                table[row][col]= cost;
                                item[row][col]=i+1;
                            }
                            else {
                                int temp = table[row][col];
                                table[row][col] = Math.min(table[row][col],cost);
                                if (table[row][col]!=temp){
                                    item[row][col]=i+1;
                                }

                            }

                        }
                    }
                }
        }
        int mn =401;
        int ma = m1;int mb=m2;
        while (ma<=400 && mb<=400){
            if (table[ma][mb]!=0){
                mn = Math.min(mn,table[ma][mb]);
            }
            ma+=m1;
            mb+=m2;
        }

        if(mn!=401){
            System.out.println(mn);
        }
        else {
            System.out.println(-1);
        }

    }
}
