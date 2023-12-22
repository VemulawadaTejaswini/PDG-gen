import java.util.*;
import java.io.*;

public class Main {
    
    static int n;
    static int[] a;
    static int[] index;
    static int[] dp;
    static int[] times;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        a=new int[n-1];
        index=new int[n];
        dp=new int[n+1];
        times=new int[n];
        index[0]=1;
        Arrays.fill(dp,-1);
        int count=0;
        for(int i=0;i<n-1;i++){
            a[i]=Integer.parseInt(br.readLine());
            times[a[i]-1]++;
            index[i+1]=i+2;
        }
        int one=times[0];
        //quick(times,0,n-1);
        for(int i=0;i<n;i++){
            if(times[i]==0){
                count=Math.max(count,dfs(a[index[i]-2]));
            }
        }System.out.println(count+1);
        //System.out.println(Arrays.toString(times)+"\n"+Arrays.toString(index));
    }
    
    static int dfs(int target){
        //System.out.println("target="+target);
        if(dp[target]!=-1){ return dp[target]; }
        if(target==1) return 0;
        return dfs(a[target-2])+times[target-1];
    }
 /*   
    static void quick(int[] q_a, int left, int right) {
        if (left > right) {
            return;
        }
        if ((right - left) <= 100) {
            int temp, j;
            for (int i = left; i <= right; i++) {
                j = i;
                while (j > left && q_a[j - 1] > q_a[j]) {
                    temp = q_a[j];
                    q_a[j] = q_a[j - 1];
                    q_a[j - 1] = temp;
                    
                    temp = index[j];
                    index[j] = index[j - 1];
                    index[j - 1] = temp;
            
                    j--;
                }
            }
        } else {
            int[] temp = partition(q_a, left, right);
            quick(q_a, left, temp[0] - 1);
            quick(q_a, temp[1] + 1, right);
        }
    }

    static int[] partition(int[] q_a, int left, int right) {
        int mid_index = (left + right) / 2;
        int mid = q_a[mid_index];
        int left_index = left;
        int right_index = right;
        int temp;
        while (true) {
            while (q_a[left_index] < mid) {
                left_index++;
            }
            while (q_a[right_index] > mid) {
                right_index--;
            }
            if (left_index >= right_index) {
                break;
            }
            temp = q_a[left_index];
            q_a[left_index] = q_a[right_index];
            q_a[right_index] = temp;
            
            temp=index[left_index];
            index[left_index] = index[right_index];
            index[right_index] = temp;
            
            left_index++;
            right_index--;
        }
        return (new int[]{left_index, right_index});
    }
    */
}