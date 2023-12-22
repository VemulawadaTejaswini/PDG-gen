import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws IOException {
    String[] strs;
    String[] nums;
    try(BufferedReader br
        = new BufferedReader(new InputStreamReader(System.in))
    ){
      strs = br.readLine().split(" ");
      nums = br.readLine().split(" ");
    }
    int N = Integer.parseInt(strs[0]);
    int K = Integer.parseInt(strs[1]);
    int sum = 0;
    Set<Integer> s = new HashSet<Integer>();
    for (int i = 0; i < K; i++) {
      s.add(Integer.parseInt(nums[i]));
    }
    
    for (int n = N; n <= 100000; n++) {
      boolean f = true;
      String nSize = String.valueOf(n);
      int tmp = n;
      for (int j = 0; j < nSize.length(); j++) {
        if (s.contains(tmp % 10)) {
          f = false;
          break;
        }
        tmp /= 10;
      }
      if (f) {
        sum = n;
        break;
      }
    }
    System.out.println(sum);
    System.out.println(s);
  }
}
