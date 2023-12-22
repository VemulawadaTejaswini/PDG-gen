import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int [2][n];
        int d[][]=new int [2][n];
        for(int i=0;i<2;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        for(int i=0;i<2;i++)
            for(int j=0;j<n;j++){
                int v1=0,v2=0;
                if(i-1>=0) v1=d[i-1][j];
                if(j-1>=0) v2=d[i][j-1];
                d[i][j]=Math.max(v1,v2)+a[i][j];
            } 
        System.out.println(d[1][n-1]);
    }
}