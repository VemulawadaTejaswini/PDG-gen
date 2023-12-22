class Main{
  public static long solve2(int[] h, int[] b){
        long ans = Integer.MIN_VALUE;
        int[] dp = new int[h.length];
        for(int i = 0; i < b.length; i++){
            dp[i] = b[i];
        }
        for(int i = 1; i < h.length; i++){
            for(int j = 0; j < i; j++){
                if(h[i] > h[j] && dp[i] < dp[j]+b[i]){
                    dp[i] = b[i] + dp[j];
                }
            }
        }
        //System.out.println(Arrays.toString(dp));
        for(int i = 0; i < b.length; i++){
            if(ans < dp[i]){
                ans = dp[i];
            }
        }
        return ans;
    }
  public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer str;
      int n = Integer.parseInt(br.readLine());
      int[] h = new int[n];
      int[] b = new int[n];
      str = new StringTokenizer(br.readLine()," ");
      int i = 0;
      while(str.hasMoreTokens()){
          h[i] = Integer.parseInt(str.nextToken());
          i++;
      }
      str = new StringTokenizer(br.readLine()," ");
      i = 0;
      while(str.hasMoreTokens()){
          b[i] = Integer.parseInt(str.nextToken());
          i++;
      }
    
      System.out.println(solve2(h, b));
      
    }
}