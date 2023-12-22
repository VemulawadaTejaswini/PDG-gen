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

        // aMap.get(i&1).merge(num, 1, Integer::sum);
        if(aMap.get(i&1).containsKey(num))
          aMap.get(i&1).replace(num, aMap.get(i&1).get(num) + 1);
        else
          aMap.get(i&1).put(num, 1);
      }

      int[] vm1 = {0,0};
      int[] vm2 = {0,0};
      int[] x   = {0,0};

      for (int i=0; i<aMap.size(); i++) {
        int j = i;
        aMap.get(j).forEach((key,val) -> {
          if(vm1[j] < val) {
            vm2[j] = vm1[j];
            vm1[j] = val;
            x[j]  = key;
          } else if(vm2[j] < val) {
            vm2[j] = val;
          }
        });
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