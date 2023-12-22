import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] dp=new int[100001];
        dp[0]=0;
        int n=scan.nextInt();
        int i=1;
        int num=0;
        int[] element=new int[100];
        while(i*9<=n){
            i*=9;
            element[num]=i;
            num++;
        }
        i=1;
        while(i*6<=n){
            i*=6;
            element[num]=i;
            num++;
        }
        int flag=0;
        for(int k=1;k<=n;k++){
            dp[k]=100000;
            flag=0;
            for(int l=0;l<num;l++){
                if((k-element[l])>=0){
                    int box=Math.min(dp[k-1],dp[k-element[l]])+1;
                    dp[k]=Math.min(dp[k],box);
                    flag++;
                }
            }
            if(flag==0) dp[k]=dp[k-1]+1;
        }
        System.out.println(dp[n]);
    }
}