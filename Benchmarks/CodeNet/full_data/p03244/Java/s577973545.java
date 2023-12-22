import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(in.readLine());
      String line = in.readLine();
      int nHalf = n >> 1;

      // int[] seqA = new int[nHalf];
      // int[] seqB = new int[nHalf];
      // int[][] seq = {seqA, seqB};

      Integer num;
      Map<Integer,Integer> mapA = new HashMap<>();
      Map<Integer,Integer> mapB = new HashMap<>();
      List<Map<Integer,Integer>> aMap = new ArrayList<>();
      aMap.add(mapA);
      aMap.add(mapB);
      int offset=0,next=0;
      char regx = ' ';

      for(int i=0; i<n; i++) {
        if((next = line.indexOf(regx,offset)) == -1)
          next = line.length();
        num = new Integer(line.substring(offset, next));
        offset = ++next;

        // seq[(i&1)][i>>1] = num;
        aMap.get(i&1).merge(num, 1, Integer::sum);
      }

      int[] vm1 = {0,0};
      int[] vm2 = {0,0};
      int[] x   = {0,0};

      for (int i=0; i<aMap.size(); i++) {
        for (Map.Entry<Integer,Integer> m : aMap.get(i).entrySet()) {
          int val = m.getValue();
          if(vm1[i] <val) {
            vm2[i] = vm1[i];
            vm1[i] = val;
            x[i]  = m.getKey();
          } else if(vm2[i] < val) {
            vm2[i] = val;
          }
        }
      }

      int ans = 0;
      int cca1 = nHalf - vm1[0];
      int ccb1 = nHalf - vm1[1];
      int cca2 = nHalf - vm2[0];
      int ccb2 = nHalf - vm2[1];

      if(x[0] == x[1])
        ans = cca2 > ccb2 ? cca1 + ccb2 : cca2 + ccb1;
      else
        ans = cca1 + ccb1;

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}