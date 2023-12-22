import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int d = 0;
        int m = 0;
        String str;
        char s[][] = new char [H][W];
        int Cost[][] = new int [H][W];
        for(int i=0;i<H;i++){
          str = sc.next();
          for(int j=0;j<W;j++){
            s[i][j] = str.charAt(j);
            Cost[i][j] = 10000;
            if(s[i][j]=='.')
              d++;
          }
        }
        Cost[0][0] = 0;

        for(int k=0;k<H*W;k++){
          for(int i=0;i<H;i++){
            for(int j=0;j<W-1;j++){
              if(s[i][j]=='.' && s[i][j+1]=='.'){
                Cost[i][j]=Math.min(Cost[i][j+1]+1,Cost[i][j]);
                Cost[i][j+1]=Math.min(Cost[i][j]+1,Cost[i][j+1]);
              }  
              else{
                Cost[i][j]=Math.min(Cost[i][j+1]+10000,Cost[i][j]);
                Cost[i][j+1]=Math.min(Cost[i][j]+10000,Cost[i][j+1]);
              }
            }
          }
          for(int i=0;i<H-1;i++){
            for(int j=0;j<W;j++){
              if(s[i][j]=='.' && s[i+1][j]=='.'){
                Cost[i][j]=Math.min(Cost[i+1][j]+1,Cost[i][j]);
                Cost[i+1][j]=Math.min(Cost[i][j]+1,Cost[i+1][j]);
              }  
              else{
                Cost[i][j]=Math.min(Cost[i+1][j]+10000,Cost[i][j]);
                Cost[i+1][j]=Math.min(Cost[i][j]+10000,Cost[i+1][j]);
              }
            }
          }

        } 
        if(Cost[H-1][W-1]<10000){
          m = Cost[H-1][W-1];
          System.out.println(d-m-1);
        }
        else
          System.out.println(-1);
//        System.out.println(d +" "+ m);
         
	}

}
