import java.util.*;

public class Main {
    static int[] A;
    static int N;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N];
        for(int i = 0; i < N;i ++){
            A[i] = sc.nextInt();
        }
        int b = goldSectionSearchDeko((int)-1e9 - 9, (int)1e9+9);
        long res = solve(b);
        System.out.println(res);
    }
    
    public static long solve(int b)
    {
        long res = 0;
        for (int i = 0; i < N; i++)
        {
            res += (Math.abs(A[i] - b - i - 1));
        }
        return res;
    }
    
    public static int goldSectionSearchDeko(int left,int right){
        double GRATIO=1.6180339887498948482045868343656;
        int lm = left + (int)((right-left)/(GRATIO+1.0));
        int rm = lm + (int)((right-lm )/(GRATIO+1.0));
        long fl = solve(lm);
        long fr = solve(rm);
        while(right - left > 10){
            if(fl < fr){
                right = rm;
                rm = lm;
                fr = fl;
                lm = left + (int)((right-left)/(GRATIO+1.0));
                fl = solve(lm);
            }else{
                left = lm;
                lm = rm;
                fl = fr;
                rm = lm + (int)((right-lm )/(GRATIO+1.0));
                fr = solve(rm);
            }
        }
        long minScore = Long.MAX_VALUE;
        int resIndex = left;
        for(int i = left ; i < right + 1 ; i++){
            long score = solve(i);
            if(minScore > score){
                minScore = score;
                resIndex = i;
            }
        }
        return resIndex;
    }
}
