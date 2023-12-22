import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums=new int[sc.nextInt()];
        int[] nums2=new int[nums.length];
        int output=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i]!=0){
                    System.out.println(-1);
                    return;
                }else{
                    nums2[i]=0;
                }
            }else{
                nums2[i]=nums[i]-nums[i-1];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums2[i]==1){
                output+=1;
            }else if(nums2[i]<1){
                output+=nums[i];
            }else{
                System.out.println(-1);
                return;
            }
        }
        System.out.println(output);
        
        
        

}

}