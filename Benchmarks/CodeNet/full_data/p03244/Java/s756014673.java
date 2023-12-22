import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
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
      Map<Integer,Integer> mapB = new HashMap<>();;
      int offset=0,next=0;
      char regx = ' ';

      for(int i=0; i<n; i++) {
        if((next = line.indexOf(regx,offset)) == -1)
          next = line.length();
        num = new Integer(line.substring(offset, next));
        offset = ++next;

        if((i&1) == 0)
          mapA.merge(num, 1, Integer::sum);
        else
          mapB.merge(num, 1, Integer::sum);
      }

      int[] vm1 = {0,0};
      int[] vm2 = {0,0};
      int[] x   = {0,0};

      for (Map.Entry<Integer,Integer> m : mapA.entrySet()) {
        int val = m.getValue();
        if(vm1[0] <val) {
          vm2[0] = vm1[0];
          vm1[0] = val;
          x[0]  = m.getKey();
        } else if(vm2[0] < val) {
          vm2[0] = val;
        }
      }
      for (Map.Entry<Integer,Integer> m : mapB.entrySet()) {
        int val = m.getValue();
        if(vm1[1] <val) {
          vm2[1] = vm1[1];
          vm1[1] = val;
          x[1]  = m.getKey();
        } else if(vm2[1] < val) {
          vm2[1] = val;
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