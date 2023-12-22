import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class Main{
    static double mod = 1e9+7;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int[][] c = new int[3][3];
        int[] rate = new int[2];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                c[i][j] = sc.nextInt();
            }
        }
        for (int i=1;i<3;i++){
            rate[i-1] = c[0][i] - c[0][i-1];
        }
        for (int i=1;i<3;i++){
            for (int j=1;j<3;j++){
                if (c[i][j]-c[i][j-1]!=rate[j-1]){
                    System.out.println("No");
                    return;
                }
            }
        }
        for (int i=1;i<3;i++){
            rate[i-1] = c[i][0] - c[i-1][0];
        }
        for (int i=1;i<3;i++){
            for (int j=1;j<3;j++){
                if (c[j][i]-c[j-1][i]!=rate[j-1]){
                    System.out.println("N0");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}

class Library{
    static long a;
    static long b;

    public static long gcd(long a,long b){
        Library lib = new Library();
        if (a<b){
            lib.swap(a,b);
        }
        if (b==0){
            return a;
        } else {
            return gcd(b,a%b);
        }
    }

    public static void swap(long a,long b){
        long x = a;
        a = b;
        b = x;
        return;
    }
}