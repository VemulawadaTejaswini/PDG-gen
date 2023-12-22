import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i=0;i<5;i++){
            nums[i] = sc.nextInt();
        }
        nums[0] *= 8;
        nums[1] *= 4;
        nums[2] *= 2;
        int minl = nums[0];
        for(int i=1;i<4;i++){
            minl = Math.min(minl,nums[i]);
        }
        
        if(nums[4]%2==1&&minl==nums[3]){
            int sum = 0;
            sum = nums[4]/2*minl;
            minl=nums[0];
            for(int i=1;i<3;i++){
                minl = Math.min(minl,nums[i]);
            }
            sum += minl/2;
            System.out.println(sum);
        }else{
            System.out.println(minl*nums[4]/2);
        }
        return;
        
        
    }
}