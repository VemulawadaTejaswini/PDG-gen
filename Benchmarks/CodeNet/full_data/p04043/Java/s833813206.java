

import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int [] nums = new int[3];
       for(int i = 0 ; i<3;i++){
       nums[i] = scanner.nextInt();
       }
       int sum = 0;
       int count = 0;
       for(int i = 0 ; i<nums.length;i++){
       if(nums[i] == 5){
       sum++;
       } else if(nums[i]  == 7 ){
       count++;
       } else{
       sum +=0;
       count+=0;
       }
       
       
       
       }
       if(sum == 2 && count ==1){
           System.out.println("YES");
       } else {
           System.out.println("NO");
       }
       
       
    }
    
}
