import java.util.*;
import java.util.Arrays;
public class Main{
    public static boolean check(int k){
        for(int i=0;i*i<=k;i++){
            if(i*i==k){
                return true;
            }
           
        }
        return false;
    }
    public static int dis(int [][]x,int n,int d,int i,int j){
        int sum =0;
        for(int k=0;k<d;k++){
            int v = x[i][k]-x[j][k];
            sum += v;
        }
        return sum;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int d = sc.nextInt();
       int [][] a = new int[n][d];
       for(int i=0;i<n;i++){
           for(int j=0;j<d;j++){
               a[i][j] = sc.nextInt();
           }
       }
       int count =0 ;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<d;j++){
               if(i!=j){
                   int len = dis(a,n,d,i,j);
                   if(check(len)){
                       count++;
                    }
               }

               
           }
       }
       System.out.println(count);
    }
   
    
       
    
}