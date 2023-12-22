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
        int n=in.nextInt();
        ArrayList<Integer>six=new ArrayList<>(),nine=new ArrayList<>();
        int i=6;
        while(i<=100000){
            six.add(i);
            i=i*6;
        }
        i=9;
        while(i<=100000){
            nine.add(i);
            i=i*9;
        }
        arr=new ArrayList<>();
        arr.addAll(six);
        arr.addAll(nine);
        arr.add(1);
        dp=new int[n+1];
        Arrays.fill(dp,(int)1e9);
        System.out.println(r(n));
    }
    static int r(int n){
        /*if(n==0){
            return 0;
        }
        if(n<0){
            return (int)1e9;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int min=(int)1e9;
        for (int i =arr.size()-1; i>=0; i--) {
            min=Math.min(min,1+r(n-arr.get(i)));
        }
        return dp[n]=min;*/
        dp[0]=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<arr.size();j++){
                if(i-arr.get(j)>=0) {
                    dp[i] = Math.min(dp[i], dp[i - arr.get(j)]);
                }
            }
            dp[i]++;
        }
        return dp[n];
    }
}