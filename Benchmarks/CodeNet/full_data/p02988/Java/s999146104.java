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
        
        int count = 0;
        for (int i = 1; i < n-1; i++) {
            if (nums[i-1] < nums[i] && nums[i] < nums[i+1]) count++;
            else if (nums[i-1] > nums[i] && nums[i] > nums[i+1]) count++;
        }
        
        System.out.println(count);
    }
}



