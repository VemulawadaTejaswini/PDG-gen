import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int target, num;
    String str = br.readLine();
    StringTokenizer st = new StringTokenizer(str);
    target = Integer.parseInt(st.nextToken());
    num =Integer.parseInt(st.nextToken());
    
    List<Integer> strtTo = new ArrayList<Integer>();
    List<Integer> toGoal = new ArrayList<Integer>();
    
    for (int i = 0; i < num; i++) {
      int tmp1, tmp2;
      str = br.readLine();
      st = new StringTokenizer(str);
      tmp1 = Integer.parseInt(st.nextToken());
      tmp2 = Integer.parseInt(st.nextToken());
      
      if (tmp1 == 1) {
        strtTo.add(tmp2);
      } else if (tmp2 == target) {
        toGoal.add(tmp1);
      }
    }
    
    boolean flag = false;
    for (int i = 0; i < strtTo.size(); i++) {
      for (int j = 0; j < toGoal.size(); j++) {
        if (strtTo.get(i) == toGoal.get(j)) {
          System.out.println("POSSIBLE");
          flag = true;
          break;
        }
        if (flag) {
          break;
        }
      }
    }
    
    if (!flag) {
      System.out.println("IMPOSSIBLE");
    }
  }

}
