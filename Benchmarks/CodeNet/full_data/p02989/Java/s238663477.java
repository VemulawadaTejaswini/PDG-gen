import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.awt.Point;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        String[] s = br.readLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        
        Arrays.sort(nums);
        int mid = nums.length/2;
        
        int ans = 0;
        if (nums[mid] != nums[mid-1]) {
            ans = nums[mid] - nums[mid-1];
        }
        
        System.out.println(ans);
    }
}



