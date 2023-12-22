import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    static int dp[];
    static ArrayList<Integer>arr;
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),c=in.nextInt();
        int d[][]=new int[c][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                d[i][j]=in.nextInt();
            }
        }
        int mat[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j]=in.nextInt()-1;
            }
        }
        long min=(long)1e9;
        for(int i=0;i<c;i++){
            for (int j = 0; j <c; j++) {
                if(i==j)continue;
                for (int k =0; k <c; k++) {
                    if(j==k || k==i || j==i)continue;
                    int c1=i,c2=j,c3=k;
                    long cost1=0,cost2=0,cost3=0;
                    for (int l = 0; l < n; l++) {
                        for (int m = 0; m < n; m++) {
                            if((l+m)%3==0){
                                cost1+=(long)d[mat[l][m]][c1];
                            }
                            if((l+m)%3==1){
                                cost1+=(long)d[mat[l][m]][c2];
                            }
                            if((l+m)%3==2){
                                cost1+=(long)d[mat[l][m]][c3];
                            }
                        }
                    }
                    min=Math.min(cost1+cost2+cost3,min);
                }
            }
        }
        System.out.println(min);
    }
}