import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] in1 = br.readLine().split(" ");
    int N = Integer.parseInt(in1[0]);

    in1 = br.readLine().split(" ");
    int[] A = Stream.of(in1).mapToInt(Integer::parseInt).toArray();
    br.close();

    int[] B = new int[N];
    for(int i = 0; i < N; i++){
      B[A[i] - 1] = i;
    }

    TreeSet<Integer> ts = new TreeSet<>();
    long ans = 0L;
    for(int i = 0; i < N; i++){
      ts.add(B[i]);
      
      int right = ts.higher(B[i]) == null ? N : ts.higher(B[i]);
      int left = ts.lower(B[i]) == null ? -1 : ts.lower(B[i]);
      
      ans += (i + 1) * (B[i] - left) * (right - B[i]);
    }

    System.out.println(ans);
  }
}