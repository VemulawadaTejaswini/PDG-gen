import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    String S = scanner.next();
    int n = S.length();
    byte[] nums = new byte[n];
    for(int i=0;i<n;i++) {
      nums[i] = (byte)(S.charAt(i)-'0');
    }

    int max = (int)Math.pow(2, n-1);
    long sum = 0;
    for(int i=0;i<max;i++) {
      sum += calc(nums, i);
    }
    System.out.println(sum);

    scanner.close();
  }

  private static long calc(byte[] nums, int p) {
    boolean[] plus = new boolean[nums.length-1];
    for(int i=0;i<plus.length;i++) {
      if((p>>i)%2 == 1) plus[i] = true;
    }

    String exp = "";
    for(int i=0;i<nums.length;i++) {
      exp += nums[i];
      if((i==nums.length-1) || plus[i]) {
        exp += "a";
      }
    }

    String[] values = exp.split("a");
    long sum = 0;
    for(String v : values) {
      sum += Long.parseLong(v);
    }
    
    return sum;
  }
}
