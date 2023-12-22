//  2018/4/15

import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {

    Scanner  sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] nums = new int[n];

    for(int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }

    def(n, nums);
  }

  public static void def(int n, int[] nums) {
    int nx = n-1;
    int count;
    int[] ce;

    for(int i = 0; i < n; i++) {
      ce = new int[nx];
      count = nx-1;
      for(int l = 0; l < n; l++) {
        if(l != i) {
		      ce[count--] = nums[l];
        }
      }

      Arrays.sort(ce);
      if (nx % 2 != 0) {
        System.out.println(ce[nx/2]);
      } else {
        System.out.println(ce[nx-1/2]);
      }
    }

  }
}
