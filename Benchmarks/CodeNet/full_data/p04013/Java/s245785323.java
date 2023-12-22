import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] cards = new int[N];

        for(int i=0;i<N;i++)
            cards[i]=Integer.parseInt(st.nextToken());

        Long[][] dp = new Long[2502][52];
        System.out.println(findWays(0,cards,0,0,A,dp));
    }

    public static long findWays(int idx, int[] cards, int sum, int count, int A, Long[][] dp){
        if(idx>cards.length-1){
            if(count!=0 && sum/count==A && sum%count==0)
                return 1;
            return 0;
        }
        // if(count!=0 && sum/count==A && sum%count==0)
        //     return 1;
        // if(dp[sum][idx]!=null)
        //     return dp[sum][idx];

        

        long ans=0;
        ans+=findWays(idx+1, cards, sum, count, A, dp);
        ans+=findWays(idx+1, cards, sum+cards[idx], count+1, A, dp);

        return (dp[sum][idx]=ans);

    }
}