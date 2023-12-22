public class Main {
 	
  
  public static void main(String abc[]) {
     Main ans = new Main();
     System.out.println(ans.solve());
  }
  
  private long solve() {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     long [] array = new long [N+1];
     int i=0;
     long sum=0;
     while(i<=N){
        array[i++] = sc.nextLong();
        sum+= array[i-1];
     }
    
     long [][][] dp =new long[3001][3001][2];
    
     long X =  solve(dp, array, 1, 0, N);
     long Y = sum-X;
     return X-Y;
  }
  
  private long solve(long[] dp, long[] array, int turn, int i, int j) {
     if(i>j) return 0;
     if (turn==1) {
         long left = array[i] + solve(dp, array, i+1, j);
         long right = array[j] + solve(dp, array, i, j-1);
         return Math.max(left,right);
     } else {
         long left = array[i+1] + solve(dp, array, i+2, j);
         long right = array[j-1] + solve(dp, array, i, j-2);
         return Math.min(left, right);
     }
  }
}