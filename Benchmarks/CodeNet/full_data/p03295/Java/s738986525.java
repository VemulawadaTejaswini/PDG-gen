import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int deltaMin = 100000;
    Set<Integer> nums = new TreeSet<Integer>();
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] ab = new int[m][3];
    for (int i = 0; i < m; i++) {
      ab[i][0] = sc.nextInt();
      ab[i][1] = sc.nextInt();
      ab[i][2] = ab[i][1] - ab[i][0];
      deltaMin = Math.min(deltaMin, ab[i][2]);
    }
    for (int i = 0; i < m; i++) {
      if (deltaMin == ab[i][2]) {
        nums.add(ab[i][0]);
      }
    }
    int count = nums.size();
    if (deltaMin != 1) {
      for (int num : nums) {
      	for (int i = 1; i <= deltaMin; i++) {
          if (nums.contains(num + i)) {
          	count--;
          }
      	}
      }
    }
    
    System.out.println(count);

  }
}