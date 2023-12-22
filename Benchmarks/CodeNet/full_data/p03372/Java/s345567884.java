import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        long c = Long.parseLong(input[1]);
        long pos[] = new long[n + 1];
        long val[] = new long[n + 1];
        long max[] = new long[n + 1];
        long maxPos[] = new long[n + 1];
        long premax[] = new long[n + 1];

        long befMax = 0;
        int befPos = 0;
        for(int i = 1; i <= n; i++){
            input = br.readLine().split(" ");
            pos[i] = Long.parseLong(input[0]);
            val[i] = Long.parseLong(input[1]);
            premax[i] = premax[i-1] - pos[i] + pos[i-1] + val[i];
            if(befMax < premax[i]){
                max[i] = premax[i];
                befMax = max[i];
                befPos = i;
                maxPos[i] = pos[i];
            }else{
                max[i] = befMax;
                maxPos[i] = pos[befPos];
            }
        }

        long result = max[n];
        long beforeAcc = 0;
        long dist;
        for(int i = n; i >= 1; i--){
            if(i != n){
                dist = (pos[i] - pos[i+1]);
            }else{
                dist = (pos[i] - c);
            }
            beforeAcc += dist + val[i];
            
            //maxPos[i-1] と c-pos[i]のうち小さいほうをスコアから引く
            result = Math.max(result, beforeAcc + max[i-1] - Math.min(maxPos[i-1], c-pos[i]));
        }

        System.out.println(result);
    }
}