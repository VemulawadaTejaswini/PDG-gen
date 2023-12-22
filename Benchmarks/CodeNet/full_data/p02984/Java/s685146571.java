import java.util.*;
import java.io.*;



public class Main{
    static int INFTY=Integer.MAX_VALUE;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
            int n=sc.nextInt();
            int[] lake = new int[n+1];
            int[] mountain = new int[n+1];

            for(int i=1;i<=n;i++){
                lake[i]=sc.nextInt();
            }
            //iは山1の降水量/2
            for(int i=0;i<=lake[1];i++){
                mountain[1]=2*i;
                //jは山2以降の山のindex
                for(int j=2;j<=n;j++){
                    mountain[j]=2*lake[j-1]-mountain[j-1];
                }
                if((mountain[n]+mountain[1])/2==lake[n]){
                    break;
                }
            }
            for(int i=1;i<=n;i++){
                System.out.print(mountain[i]+" ");
            }
    }
}