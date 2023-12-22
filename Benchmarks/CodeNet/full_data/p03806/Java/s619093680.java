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
        int [][] table = new int[11][11];
        int n = in.nextInt();
        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int [][] shops = new int[n][3];
        for(int i=0;i<n;i++){
            shops[i][0] = in.nextInt();
            shops[i][1]= in.nextInt();
            shops[i][2] = in.nextInt();
            BigInteger a = BigInteger.valueOf(shops[i][0]);
            BigInteger b = BigInteger.valueOf(shops[i][1]);
            BigInteger gcd = a.gcd(b);
            shops[i][0]/= gcd.intValue();
            shops[i][1]/= gcd.intValue();
            int r =shops[i][0];
            int c = shops[i][1];
            if(table[r][c]==0){
                table[r][c] = shops[i][2];
            }
            else {
                table[r][c] = Math.min(shops[i][2],table[r][c]);
            }

        }
        Boolean chage = true;
        int count = 0;
        while (chage){
            count++;
            chage=false;
            for(int i=1;i<10;i++){
                for(int ii=0;ii<=10;ii++) {
                    for (int j = 1; j <i; j++) {
                        for (int k = 1; k <ii; k++) {
                            int r1 = i-j;
                            int c1 = ii-k;
                            BigInteger a = BigInteger.valueOf(j);
                            BigInteger b = BigInteger.valueOf(k);
                            BigInteger gcd = a.gcd(b);
                            int r = j/gcd.intValue();
                            int c = k/gcd.intValue();
                            a = BigInteger.valueOf(r1);
                            b = BigInteger.valueOf(c1);
                            gcd = a.gcd(b);
                            r1/=gcd.intValue();
                            c1/= gcd.intValue();
                            if (table[r][c] != 0 && table[r1][c1]!=0) {
                                a = BigInteger.valueOf(i);
                                b = BigInteger.valueOf(ii);
                                gcd = a.gcd(b);
                                int row = i/gcd.intValue();
                                int col = ii/gcd.intValue();
                                int cost = table[r][c]+table[r1][c1];
                                if (table[row][col]==0){
                                    chage = true;
                                    table[row][col]=cost;
                                }
                                else {
                                    int temp = table[row][col];
                                    table[row][col] = Math.min(temp,cost);
                                    if(temp!=table[row][col]){
                                        chage=true;
                                    }
                                }
                            }

                        }
                    }
                }
            }
        }



        if(table[m1][m2]!=0){
            System.out.println(table[m1][m2]);
        }
        else {
            System.out.println(-1);
        }


    }
}
