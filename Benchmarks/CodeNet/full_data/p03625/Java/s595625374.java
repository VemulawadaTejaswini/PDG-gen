import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long[] nums=new long[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        int count=0;
        long ans=1;
        for(int i=n-1;i>0;i--){
            if(count==0&&nums[i]==nums[i-1]){
                ans=nums[i];
                count++;
                i--;
            }else if(count==1&&nums[i]==nums[i-1]){
                System.out.println(ans*nums[i]);
                return;
            }
        }
        System.out.println(0);
    }
}