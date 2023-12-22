import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        while(true){
           
           for(int i=0;i<nums.length;i++){
               if(i!=nums.length-1){
                   nums[nums.length-i-1]=nums[nums.length-i-1]-nums[nums.length-i-2];
               }
               
           }
           Arrays.sort(nums);
           if(nums[nums.length-2]==0){
                   System.out.println(nums[nums.length-1]);
                   return;
               }
        }
        

        
    }
}