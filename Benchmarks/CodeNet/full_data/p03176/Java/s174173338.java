import java.util.*;
import java.io.*;

class java {
    
    public static long solve(int[] flowers, int[] price, int i, int prev, long[][] memo){
        
        if(i >= flowers.length)
            return 0;
        long ans = 0l;
        // if(memo[prev+1][i] > -1)
        //     return memo[prev+1][i];
         if(prev == -1 || flowers[prev] < flowers[i])
           ans = Math.max(ans,price[i] + solve(flowers, price, i+1,i,memo));
        ans  = Math.max(ans,solve(flowers,price,i+1,prev,memo));
        return ans;
    }
   
   
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str  = new StringTokenizer(br.readLine(), " ");
        int[] flowers = new int[n];
        int i = 0;
        while(str.hasMoreTokens()){
            flowers[i] = Integer.parseInt(str.nextToken());
            i++;
        }
        i = 0;
        int[] price = new int[n];
        str  = new StringTokenizer(br.readLine(), " ");
        while(str.hasMoreTokens()){
            price[i] = Integer.parseInt(str.nextToken());
            i++;
        }
        i = 0;
        long[][] memo = new long[price.length+1][price.length+1];
        for(i = 0; i < price.length; i++)
            Arrays.fill(memo[i],-1);

        System.out.print(solve(flowers,price,0,-1,memo));

    }
}