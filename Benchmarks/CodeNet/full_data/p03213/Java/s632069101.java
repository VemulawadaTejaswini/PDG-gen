class Main{
  
  public static void main(String args[]){
    int n = new java.util.Scanner(System.in).nextInt();
    
    boolean prime[] = new boolean[n+1];

    java.util.Arrays.fill(prime,true);
    prime[0] = false;
    prime[1] = false;
        
    for(int i = 2; i < prime.length; i++){
      if(prime[i]){
        for(int j = i + i ; j < prime.length; j += i){
          prime[j] = false;
        }
      }
    }
    
    int[] v = new int[n+1];
    for(int i = 0; i< n+1;i++){
      primes(prime,i,v);
    }
//    System.out.println(java.util.Arrays.toString(v));

    int dp[][] = new int[n+2][77];
    dp[0][1] = 1;
    
    for(int i =0 ; i < n+1 ; i++){
      for(int j = 0; j < 76;j++){
        for(int k = 0 ; k <= v[i]; k++){
          if(j * (k+1) > 75) break;
          dp[i+1][j*(k+1)] += dp[i][j];
        }
      }
//      System.out.println(i+" "+java.util.Arrays.toString(dp[i+1]));
    }
    
    System.out.println(dp[n+1][75]);
  }
  
  static int[] primes(boolean[]primes, int target, int[] res){
    for(int i =0; i < primes.length; i++){
      if(primes[i]){
        int t = target;
        while(t % i == 0 && t > 0){
          res[i]++;
          t /= i;
        }
      }
    }
    return res;
  }
}