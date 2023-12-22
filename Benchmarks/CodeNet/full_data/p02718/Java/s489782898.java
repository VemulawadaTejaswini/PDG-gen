import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        
        int[] nums = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        sum = sum/(4*n);
        Arrays.sort(nums);
        String ans = "No";
        for(int j=n-1; j>=0; j--){
            if(nums[j]>sum){
                num--;
                if(num==0){
                    ans = "Yes";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
