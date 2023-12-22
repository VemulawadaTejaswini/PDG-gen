import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        int n = sc.nextInt();
        int t = sc.nextInt();
        int[][] ab = new int[n][2];
        for (int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            ab[i][0] = a;
            ab[i][1] = b;
        }

        Arrays.sort(ab, (c1, c2)->c1[0]-c2[0]);

//        System.out.println(ab[0][1]);


        PriorityQueue<int[][]> pq = new PriorityQueue<>();
        
        int[] dp = new int[t];
        
        int max = 0;
        
        for (int i=0; i<n; i++){
            int a = ab[i][0];
            int b = ab[i][1];
            max = Math.max(max, dp[t-1]+b);
            
            for (int j=t-1; j>=0; j--){
                if (j>=a){
                    dp[j] = Math.max(dp[j], dp[j-a]+b);
                }
            }
        }
        System.out.println(max);


    }
}