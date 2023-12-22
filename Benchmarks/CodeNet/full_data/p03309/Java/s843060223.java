import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    int countPlus = 0;
    int countZero = 0;
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt() - (i + 1);
      if (nums[i] > 0) {
        countPlus++;
      } else if (nums[i] == 0) {
        countZero++;
      }
    }
    while (true) {
      if (countPlus > (n - countPlus)) {
        countPlus = 0;
        countZero = 0;
        for (int i = 0; i < n; i++) {
          nums[i]--;
          if (nums[i] > 0) {
            countPlus++;
          } else if (nums[i] == 0) {
            countZero++;
          }
        }
     
      } else if (n - (countPlus + countZero) > (countPlus + countZero)) {
        countPlus = 0;
        countZero = 0;
        for (int i = 0; i < n; i++) {
          nums[i]++;
          if (nums[i] > 0) {
            countPlus++;
          } else if (nums[i] == 0) {
            countZero++;
          } 
        }
      } else {
          break;
      }

    
    
    }
    int total = 0;
    for (int i = 0; i < n; i++) {
      total += Math.abs(nums[i]);
    }
    System.out.println(total);
  }
}