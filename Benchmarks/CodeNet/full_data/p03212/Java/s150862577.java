class Main{
  public static void main(String[] args){
    java.util.Scanner sc = new java.util.Scanner();
    
    char[] s = sc.next().toCharArray();
    int d = s.length;
        
    int sum = 0;
    for(int i = 3 ; i < d; i++){
      int pow3 = 1;
      int pow2 = 3;
      for(int j = i ; j > 0 ; j--){
        pow3 *= 3;
        pow2 *= 2;
      }
      sum += pow3 - pow2 + 3;
    }
    
    int dp[][] = new int[1<<3][2];
    int map[] = {0,0,0,1,0,2,0,4}
    if(s[0] == 3 || s[0] == 5 || s[0] == 7){
      dp[map[s[0]]][1] = 1;
    }
    if(s[0] > 3){
      dp[map[3][0]]++;
    }
    if(s[0] > 5){
      dp[map[5][0]]++;
    }
    if(s[0] > 7){
      dp[map[7][0]]++;
    }
    
    for(int i = 1; i < d; i++){
      int next[][] = new int[1<<3][2];
      for(int j = 0 ; j < 1<<3; j++){
        next[j | 1][0] += dp[j][0];
        next[j | 2][0] += dp[j][0];
        next[j | 4][0] += dp[j][0];

        if(s[i] == 3 || s[i] == 5 || s[i] == 7){
	      next[j | map[s[i]]][1] += dp[j][1];
        }
        if(s[0] > 3){
          next[j | map[3][0]] += dp[j][1];
        }
        if(s[0] > 5){
          next[j | map[5][0]] += dp[j][1];
        }
        if(s[0] > 7){
          next[j | map[7][0]] += dp[j][1];
        }
      }
      dp = next
    }
    System.out.pritntln(sum+dp[7][0]+dp[7][1]);
    
  }
  
}