import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    final long mod = 1000000007;
    int n = 0;
    int[] c = new int[0];
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      n = Integer.parseInt(br.readLine());
      c = new int[n];
      for (int i=0;i<n;i++) c[i] = Integer.parseInt(br.readLine());
    } catch (IOException e) {
      e.printStackTrace();
    }
    List<Range> range = new ArrayList<>();
    for (int i=0;i<n-1;i++) {
      if (c[i] == c[i+1]) continue;
      for (int j=i+2;j<n;j++) {
        if (c[i] != c[j]) continue;
        if (j < n-1 && c[j] == c[j+1]) continue;
        range.add(new Range(i,j));
        break;
      }
    }
    int[] r = new int[n];
    r[0] = range.size();
    for (Range rng : range) r[rng.l+1]--;
    for (int i=0;i<n-1;i++) r[i+1] += r[i];
    int[] l = new int[n];
    l[n-1] = range.size();
    for (Range rng : range) l[rng.r-1]--;
    for (int i=n-1;i>0;i--) l[i-1] += l[i];
    long m = (long)(range.size()+1);
    for (int i=0;i<n;i++) {
      m += (long)l[i]*(long)r[i];
    }
    System.out.println(m);
  }
  private class Range {
    int l,r;
    Range(int l,int r) {
      this.l = l;
      this.r = r;
    }
  }
}