import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main
{
    static int dp[];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        List<List<Integer>> list=new ArrayList<>();
        int n=Integer.parseInt(s[0]);
        for(int i=0;i<=n;i++)
            list.add(new ArrayList<>());
        int m=Integer.parseInt(s[1]);
        for(int i=0;i<m;i++)
        {
            String str[]=br.readLine().split(" ");
            int a=Integer.parseInt(str[0]);
            int b=Integer.parseInt(str[1]);
            list.get(a).add(b);
        }
        dp=new int[n+2];
        Arrays.fill(dp,-1);
        int max=0;
        for(int i=1;i<=n;i++)
        {
            max=Math.max(max,dfs(list,i));
        }
        System.out.println(max);


    }

    private static int dfs(List<List<Integer>> list, int index) {
        int max=0;
        if(dp[index]!=-1)
            return dp[index];
        for(int i=0;i<list.get(index).size();i++)
        {
            max=Math.max(max,1+dfs(list,list.get(index).get(i)));
        }
        return dp[index]= max;
    }


}