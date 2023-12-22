import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static long findMin(int n, int[] a) {
        long[] dp = new long[n];
        dp[0]=0;
        dp[1]=Math.abs(a[1]-a[0]);
        for(int i=2;i<n;++i) {
            dp[i]=Math.min(dp[i-2]+Math.abs(a[i]-a[i-2]),dp[i-1]+Math.abs(a[i]-a[i-1]));
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        InputStreamReader r=new InputStreamReader(System.in);
        String input=null;
        BufferedReader reader = new BufferedReader(r);
        try {
            input = reader.readLine();
            int n= Integer.parseInt(input);
            int[] a= new int[n];
            String nums = reader.readLine();
            String [] nums1 = nums.split(" ");
            for(int i=0;i<nums1.length;++i) {
                a[i]=Integer.parseInt(nums1[i]);
            }
            System.out.println(findMin(n,a));
        } catch(IOException e) {

        }

    }
}
