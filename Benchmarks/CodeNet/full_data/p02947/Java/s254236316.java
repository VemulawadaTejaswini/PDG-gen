import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String[] s = new String[N];
    Map<String, Integer> map = new HashMap<>();
    
    char[] chars = new char[10];
    StringBuilder sb;
    int sum = 0;
    for (int i = 0; i < N; i++) {
      sc.next().getChars(0, 10, chars, 0);
      Arrays.sort(chars);
      sb = new StringBuilder();
      for (int j = 0; j < 10; j++) {
        sb.append(chars[j]);
      }
      s[i] = sb.toString();
      Integer val = map.get(sb.toString());
      
      if (val == null) {
        val = 1;
        map.put(sb.toString(), val);
      } else {
        sum += val;
        val += val;
        map.put(sb.toString(), val);
      }
    }
    
    System.out.println(sum);
  }
}