import java.util.*;

public class Main {
  public static void main(String[] args) {
    int count = 0;
    Scanner sc = new java.util.Scanner(System.in);
    int leng = Integer.parseInt(sc.nextLine());
    String [] nums = sc.nextLine().split(" ");
    int sum = 0;
    for (String num: nums) {
      sum += Integer.parseInt(num);
    }
    while (sum % 2 == 0) {
      count++;
      for (int i = 0; i < nums.length; i++) {
        nums[i] = String.valueOf(Integer.parseInt(nums[i]) / 2);
      }
      for (String num: nums) {
        sum = sum + Integer.parseInt(num);
      }
    }
    System.out.println(count);
  }
}
