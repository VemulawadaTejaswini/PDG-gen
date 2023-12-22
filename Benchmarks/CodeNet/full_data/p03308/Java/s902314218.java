import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int len = scanner.nextInt();
    String[] nums = scanner.nextLine().split(" ");
    for(int i= 0; i<nums.length; i++) System.out.println(nums[i]);
    Arrays.sort(nums);
    int first = Integer.parseInt(nums[0]);
    int last = Integer.parseInt(nums[len-1]);
    System.out.println(last-first);
  }
}