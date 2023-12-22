import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int dp[] = new int[N];
        for (int i=0;i<N;i++){
        dp[i] = 2147000000;
        }
      
        for(int i=0;i<N;i++){
          list.add(sc.nextInt());
        }
        dp[0] = 0;
        for(int i=0;i<N-1;i++){
          for(int j=1;j<=K;j++){
            if (i+j<=N-1){
          dp[i+j] = Math.min(dp[i]+Math.abs(list.get(i+j)-list.get(i)),dp[i+j]);
          }
          }
        }
      
        System.out.println(dp[N-1]);
    }
}