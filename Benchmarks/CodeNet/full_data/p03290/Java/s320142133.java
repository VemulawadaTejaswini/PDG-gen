import java.io.*;
import java.util.*;
public class Main {
    static int minNum;
    public static void main(String args[]) throws Exception {
        minNum = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long target = sc.nextLong();
        
        int[] numArr = new int[n];
        int[] scores = new int[n];
        for(int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
            scores[i] = sc.nextInt();
        } 
        dfs(numArr, scores, 0, 0, target);
        System.out.println(minNum);
    }

    private static void dfs(int[] numArr, int[] scores, int curNum, long curSum, long target) {
        if(curSum >= target) {
            minNum = Math.min(minNum, curNum);
            return;
        }

        for(int i = 0; i < numArr.length; i++) {
            if(numArr[i] == 0) continue;
            numArr[i]--;
            long nextSum = curSum + (i + 1) * 100;
            if(numArr[i] == 0)
                nextSum += scores[i];
            dfs(numArr, scores, curNum + 1, nextSum, target);
            numArr[i]++;
        }
    }
}