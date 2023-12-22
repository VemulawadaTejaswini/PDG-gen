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

      int[] seqA = new int[nHalf];
      int[] seqB = new int[nHalf];

      Integer num;
      Map<Integer,Integer> mapA = new HashMap<>();
      Map<Integer,Integer> mapB = new HashMap<>();
      int offset=0,next=0;
      char regx = ' ';

      for(int i=0; i<n; i++) {
        if((next = line.indexOf(regx,offset)) == -1)
          next = line.length();
        num = new Integer(line.substring(offset, next));
        offset = ++next;

        if((i & 1) == 0) {
          seqA[i>>1] = num;
          mapA.merge(num, 1, Integer::sum);
        }
        else {
          seqB[i>>1] = num;
          mapB.merge(num, 1, Integer::sum);
        }
      }

      int[] vm = new int[2];
      int[] x =  new int[2];
      vm[0] = vm[1] = x[0] = x[1] = 0;

      mapA.forEach((key,val) -> {
        if(vm[0] < val) {
          vm[0] = val;
          x[0]  = key;
        }
      });
      mapB.forEach((key,val) -> {
        if(vm[1] < val) {
          vm[1] = val;
          x[1]  = key;
        }
      });

      int cca = nHalf - vm[0];
      int ccb = nHalf - vm[1];

      int[] vm2 = new int[2];
      final int fxa = x[0];
      final int fxb = x[1];
      int ans = 0;
  
      if(fxa == fxb) {
        mapA.forEach((key,val) -> {
          if(vm2[0] < val && key != fxa)
            vm2[0] = val;
        });
        mapB.forEach((key,val) -> {
          if(vm2[1] < val && key != fxb)
          vm2[1] = val;
        });
      
        int cca2 = nHalf -vm2[0];
        int ccb2 = nHalf -vm2[1];

        ans = cca2 > ccb2 ? cca + ccb2 : cca2 + ccb;
      }
      else {
        ans = cca + ccb;
      }

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}