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

//        System.out.println("--------------------------------------------------");
//        for(int i=1;i<=10;i++){
//            for(int j=1;j<=10;j++){
//                System.out.print(table[i][j]+" ");
//            }
//            System.out.println();
//        }

//        for(int i=0;i<n;i++){
//            System.out.println((i+1)+":"+shops[i][0]+" "+shops[i][1]+" "+shops[i][2]);
//        }
        Boolean chage = true;
        int count = 0;
        while (chage){
            count++;
            chage=false;
            for(int i=0;i<n;i++){
                for (int j=1;j<=10;j++){
                    for(int k=1;k<=10;k++){
                        if(table[j][k]!=0){
                            int row= shops[i][0]+j;
                            int col= shops[i][1]+k;
                            BigInteger a1 = BigInteger.valueOf(row);
                            BigInteger a2 = BigInteger.valueOf(col);
                            BigInteger gcd = a1.gcd(a2);
                            row/= gcd.intValue();
                            col/= gcd.intValue();
                            int cost = shops[i][2]+table[j][k];
                            if(row<=10&& col<=10){
                                if (table[row][col]==0){
                                    table[row][col]=cost;
                                }
                                else {
                                    int temp = table[row][col];
                                    table[row][col] = Math.min(cost,table[row][col]);
                                    if (temp!=table[row][col]){
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
//        System.out.println("count:"+count);
//        System.out.println("--------------------------------------------------");
//        for(int i=1;i<=10;i++){
//            for(int j=1;j<=10;j++){
//                System.out.print(table[i][j]+" ");
//            }
//            System.out.println();
//        }

    }
}
