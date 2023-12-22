import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
import java.io.PrintWriter;

public class Main { //クラス名はMain
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      PrintWriter out = new PrintWriter(System.out);
      int num = Integer.parseInt(sc.next());
      Map<String, Integer> map = new HashMap<>();
      int ans = 0;
      for(int i = 0;i<num;i++){
        String str = String.valueOf(Arrays.sort(sc.next().toCharArray()));
        if(map.containsKey(str)){
          int v = map.get(str);
          ans += v;
          map.put(str,v+1);
        }else map.put(str,1);
      }
      out.println(ans);
      out.flush();
    }
}
