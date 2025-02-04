class Item {
  int val;
  int weight;
  public Item(int weight, int value) {
    this.val = value;
    this. weight = weight;
  }
}
public class Main {
 
  public static void main(String[]abc) {
     Main answer = new Main();
     long solution = answer.solve();
     System.out.println(solution);
  }
  
  private void solve() {
	Scanner sc = new Scanner(System.in); 
    int N = sc.nextInt();
    int maxWeight = sc.nextInt();
    // max value of an item = 1000
    // total max value = N items * 1000
    int [][] dp = new int[N+1][N*1000];
    long INF = (long) 1e9+1;
    for(int i=0;i<maxValue;i++){
       dp[1][i]= INF;
    }
    Item[] array = new Item[N+1];
    for(int i=1;i<=N;i++){
      array[i]= new Item(sc.nextInt(), sc.nextInt());
    }
    dp[1][item.val] = item.weight;
    dp[1][0]=0;
    for(int i=2;i<=N;i++){
      for(int j=0;j<=maxValue;i++){
        dp[i][j] = dp[i-1][j];
        if (item[i].value>j) continue;
        dp[i][j] = Math.min( dp[i-1][j], dp[i-1][j-item[i].value] + item[i].weight);
      }
    }
    long bestValue =0;
    for(int i=0;i<=maxValue;i++) {
       if (dp[N][i]<maxWeight) bestValue = Math.max(bestValue, dp[N][i]);
    }
    return bestValue;
    
                             
    
  }
  
}