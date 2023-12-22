import java.io.*;
import java.util.*;
public class Main{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String args[]){
        int n=scn.nextInt();
        
       int[]arr=new int[n];
       for(int i=0;i<n;i++)
       arr[i]=scn.nextInt();
        ans(arr,0,0,0);
        System.out.print(count);
    }
   public static long count=0;
    public static void ans(int[]arr,int vidx,long sum,int a){
    
        if(sum>count && a>=arr.length/2)
        count=sum;
        if(vidx>=arr.length)
        return ;

        ans(arr,vidx+2,sum+arr[vidx],a+1);
        ans(arr,vidx+1,sum,a);

}
}