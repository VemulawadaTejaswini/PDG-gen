public class Main {
	int mod = 1000000007;
    public int findNumWaysToDistributeCandies(int n, int k, int[] a) {
        int[][] prefix = new int[n+1][k+1];
        int[][] dp = new int[n+1][k+1];

        for(int i=0;i<=n;++i) {
            dp[i][0]=1;
            prefix[i][0]=1;
        }

        for(int i=1;i<=k;++i) {
            prefix[0][i]=1;
        }

        for(int i=1;i<=n;++i) {
            for(int j=1;j<=k;++j) {
                int low = (j-a[i]-1)>=0?prefix[i-1][j-a[i]-1]:0;
                int high = prefix[i-1][j];
                dp[i][j]=(high-low)%mod;
                prefix[i][j]=(prefix[i][j-1]+dp[i][j])%mod;
            }
        }
        return dp[n][k];
    }

    public static void main(String[] args) {
        Main m = new Main();
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        try {
            String[] line1 = reader.readLine().split(" ");
            int n = Integer.parseInt(line1[0]);
            int k = Integer.parseInt(line1[1]);
            int[] a = new int[n+1];
            String[] line2 = reader.readLine().split(" ");
            for(int i=0;i<n;++i) {
                a[i+1]=Integer.parseInt(line2[i]);
            }
            int res = m.findNumWaysToDistributeCandies(n,k,a);
            System.out.println(res);
        } catch (IOException e) {

        }
    }
}