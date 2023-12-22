import java.io.*;
import java.util.*;

public class Main{
    static String str=new String[300];
    static int[][] ary=new int[300][300];
    static int w,h,k;
    static void search(int count,int x,int y){
        int xm=0,xp=0;
        for(int i=x-1;i>-1;i--){
            if(str[y].charAt[x]=='#'||ary[y][i]>0)break;
            xm++;
            ary[y][i]=count;
        }
        for(int i=x+1;i<w;i++){
            if(str[y].charAt[x]=='#'||ary[y][i]>0)break;
            xp++;
            ary[y][i]=count;
        }
        for(int i=y-1;y>-1;i--){
            boolean flag=false
            for(int j=x-xm;j<x+xp;j++){
                if(str[i].charAt[j]=='#'||ary[i][j]>0){
                    break;
                    flag=true;
                }
                ary[i][j]=count;
            }
            if(flag)break;
        }
        for(int i=y+1;y<h;i++){
            boolean flag=false
            for(int j=x-xm;j<x+xp;j++){
                if(str[i].charAt[j]=='#'||ary[i][j]>0){
                    break;
                    flag=true;
                }
                ary[i][j]=count;
            }
            if(flag)break;
        }
    }
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        h=sc.nextInt();
        w=sc.nextInt();
        k=sc.nextInt();
        for(int i=0;i<h;i++){
            str[i]=sc.next();
            Arrays.fill(ary[i],0);
        }
        int count=1;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(str[i].charAt[j]=="#"){
                    ary[i][j]=count;
                    search(count,i,j);
                    count++;
                }
            }
        }
        for(int i=0;i<h;i++){
            for(j=0;j<w;j++){
                System.out.print(ary[i][j]);
                if(j<w-1)System.out.print(" ");
            }
            System.out.println();
        }
    }
}