
import java.util.*;

public class Main {

    static HashMap<Integer,LinkedList<Integer>> map = new HashMap<>();
    static int []dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        dp = new int [N+1];
        //int match[] = new int [N];
        for(int i=2;i<=N;i++){
           int tmp = sc.nextInt();
            if(!map.containsKey(tmp)){
                LinkedList<Integer> list = new LinkedList<>();
                list.add(i);
                map.put(tmp,list);
            }
            else{
                map.get(tmp).add(i);
            }
            dp[i]=-1;
        }
        dp[1]=-1;

        //int ans = findDepth(1,match);
        int ans = findDepth(1);

        System.out.println(ans);
        sc.close();

    }


    private static int findDepth(int tar){
        if(!map.containsKey(tar)) return 0;
        if(dp[tar]!=-1) {
           // System.out.println(tar+"hit");
            return dp[tar];}
        else{
            int max = 0;
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            for(int i:map.get(tar)){
                int t = findDepth(i);
                while(set.contains(t+1)){
                    t++;
                }
                set.add(t+1);
                max= Math.max(max,t+1);

            }
            dp[tar] = max;
            return max;
        }
    }

 }
