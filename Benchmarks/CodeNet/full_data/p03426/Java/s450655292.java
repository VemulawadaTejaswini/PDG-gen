

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */

public class Main {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int d=sc.nextInt();
        int map[][]=new int[h][w];
        for(int i=0;i<h;i++)
            for(int j=0;j<w;j++){
                map[i][j]=sc.nextInt();
            }
        int q=sc.nextInt();
        int res[]=new int[q];
        for(int k=0;k<q;k++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int sum=0;
            int x=l+d;
            
            while(x<=r){
            int x1=0,y1=0,x2=0,y2=0,flag=0;
            for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(map[i][j]==l){
                    x1=i;
                    y1=j;
                    flag=1;
                    break;
                }}
                if(flag==1) break;
            }
            flag=0;
            for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(map[i][j]==x){
                    x2=i;
                    y2=j;
                    flag=1;
                    break;
                }}
                if(flag==1) break;
            }
      //      System.out.println(x1 +" "+y1+" "+x2+" "+y2);
            sum+=Math.abs(x1-x2)+Math.abs(y1-y2);
            l=x;
            x=l+d;
            }
            res[k]=sum;
        }
        for(int i=0;i<q;i++){
            System.out.println(res[i]);
        }
    }
    
}
