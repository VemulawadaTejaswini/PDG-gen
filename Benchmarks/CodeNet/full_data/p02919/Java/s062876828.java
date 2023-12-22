import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] in1 = br.readLine().split(" ");
    int N = Integer.parseInt(in1[0]);
    
    in1 = br.readLine().split(" ");
    int[] P = Stream.of(in1).mapToInt(Integer::parseInt).toArray();
    br.close();


    int[] posInP = new int[N];
    
    for(int i = 0; i < N; i++){
      P[i]--;
      posInP[P[i]] = i;
    }

    TreeSet<Integer> largeNumPos = new TreeSet<>();
    largeNumPos.add(-1);
    largeNumPos.add(N);
    largeNumPos.add(posInP[N-1]);
    long ans = 0;

    for(int i = N-2; i >= 0; i--){
      int j = posInP[i];
      int rLim1 = largeNumPos.higher(j);
      int lLim1 = largeNumPos.lower(j);

      int rLim2 = (rLim1 == N ? N : largeNumPos.higher(rLim1));
      int lLim2 = (lLim1 == -1 ? -1 : largeNumPos.lower(lLim1));
      if(rLim1 != N){
        ans += (long)(i + 1) * (long)(j - lLim1) * (long)(rLim2 - rLim1);
      }
      if(lLim1 != -1){
        ans += (long)(i + 1) * (long)(lLim1 - lLim2) * (long)(rLim1 - j);
      }

      largeNumPos.add(j);
    }

    System.out.println(ans);
  }
}