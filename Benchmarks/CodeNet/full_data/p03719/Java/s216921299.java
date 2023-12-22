import java.util.*;

public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String line = sc.nextLine();
   int[] nums = Integer.parseInt(line.split(" "));
   if (nums[2] >= nums[0] && nums[2] <= nums[1]) {
     System.out.println("Yes");
   } else {
       System.out.println("No");
   }
 }
}