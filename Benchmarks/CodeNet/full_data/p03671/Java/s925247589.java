
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []nums = new int[3];
        for(int i = 0;i<3;i++){
        nums[i] = scanner.nextInt();
        }
        int max = 0;
        for(int i = 0;i<nums.length;i++){
        for(int j = i+1 ; j<nums.length;j++){
        if(nums[i] + nums[j] > max){
        max = nums[i] + nums[j];
        }
        
        }
        
        
        }
            
        System.out.println(max);
    }
    
}
