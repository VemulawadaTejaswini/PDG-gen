import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<Integer, Integer> even = new HashMap<>();
    Map<Integer, Integer> odd = new HashMap<>();
    for (int i = 0; i < n; i++) {
      int v = sc.nextInt();
      if (i % 2 == 0) {
        even.put(v, even.getOrDefault(v, 0) + 1);
      } else {
        odd.put(v, odd.getOrDefault(v, 0) + 1);
      }
    }
    
    int[][] evenSorted = sortMapByValue(even);
    int[][] oddSorted = sortMapByValue(odd);
    
    if (evenSorted[0][0] != oddSorted[0][0]) {
      int ans = 0;
      for (int i = 1; i < evenSorted.length; i++) {
        ans += evenSorted[i][1];
      }
      for (int i = 1; i < oddSorted.length; i++) {
        ans += oddSorted[i][1];
      }
      System.out.println(ans);
      return;
    }

    // use evenSorted[0][0]
    int ans1 = 0;
    for (int i = 1; i < evenSorted.length; i++)  {
      ans1 += evenSorted[i][1];
    }
    for (int i = 0; i < oddSorted.length; i++) {
      if (i == 1) {
        // skip
        continue;
      }
      ans1 += oddSorted[i][1];
    }

    // use oddSorted[0][0]
    int ans2 = 0;
    for (int i = 0; i < evenSorted.length; i++) {
      if (i == 1)  {
        // skip
        continue;
      }
      ans2 += evenSorted[i][1];
    }
    for (int i = 1; i < oddSorted.length; i++) {
      ans2 += oddSorted[i][1];
    }
    
    System.out.println(Math.min(ans1, ans2));
  }
  
  private static int[][] sortMapByValue(Map<Integer, Integer> map) {
    int[][] ret = new int[map.size()][2];
    int i = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      ret[i][0] = entry.getKey();
      ret[i][1] = entry.getValue();
      i++;
    }
    Arrays.sort(ret, (a, b) -> b[1] - a[1]);
    
    return ret;
  }
}