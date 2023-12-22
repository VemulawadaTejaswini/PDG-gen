import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int n = sc.nextInt();
    int[] x = new int[n];
    for (int i=0; i<n; i++) {
      x[i] = sc.nextInt();
    }

    int currPos = 0;
    int first = 0;
    int last = n-1;
    int dist = 0;
    while (first <= last) {
      int ccwToFirstDist = currPos <= x[first] ? x[first] - currPos : l - currPos + x[first];
      int cwToLast = currPos >= x[last] ? currPos - x[last] : currPos + l - x[last];
      if (ccwToFirstDist > cwToLast) {
        dist += ccwToFirstDist;
        currPos = x[first];
        first++;
      } else {
        dist += cwToLast;
        currPos = x[last];
        last--;
      }
    }
    System.out.println(dist);
  }
}
