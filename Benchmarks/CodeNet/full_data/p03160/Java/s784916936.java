import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
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
          dp[i+1] = Math.min(dp[i]+Math.abs(list.get(i+1)-list.get(i)),dp[i+1]);
          if (i+2<=N-1){
          dp[i+2] = Math.min(dp[i]+Math.abs(list.get(i+2)-list.get(i)),dp[i+2]);
          }
        }
      
        System.out.println(dp[N-1]);
    }
}