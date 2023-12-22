import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] ary=new int[2][n];
        for(int i=0;i<n;i++){
            ary[0][i]=sc.nextInt();
            ary[1][i]=i+1;
        }
        sc.close();
        for(int i=0;i<n-1;i++){
            int j;
            int min=ary[0][i];
            int check=i;
            for(j=i+1;j<n;j++){
                if(min>ary[0][j]){
                    check=j;
                    min=ary[0][j];
                }
            }
            int c=ary[1][check];
            ary[0][check]=ary[0][i];
            ary[1][check]=ary[1][i];
            ary[0][i]=min;
            ary[1][i]=c;
            System.out.print(ary[1][i]+" ");
        }
        System.out.println(ary[1][n-1]);
    }
}