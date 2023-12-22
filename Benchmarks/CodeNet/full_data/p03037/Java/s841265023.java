
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] nums=new int[n+1];
        for(int i=0;i<m;i++){
            nums[sc.nextInt()-1]++;
            nums[sc.nextInt()]--;
        }
        int ans=0;
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
            if(nums[i]==m)ans++;
        }
        System.out.println(ans);
                
    }
}


