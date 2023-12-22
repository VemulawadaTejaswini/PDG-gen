import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    while (in.hasNext()) {
      int N = in.nextInt();
      char[][] s = new char[N][10];
      
      for (int i = 0; i < s.length; ++i) {
        s[i] = in.next().toCharArray();
        
        Arrays.sort(s[i]);
      }
      
      HashMap<String, Integer> appearTimes = new HashMap<String, Integer>();
      long count = 0;
      for (int i = s.length - 1; i >= 0; --i) {
        String si = new String(s[i]);
        
        if (appearTimes.containsKey(si)) {
          int times = appearTimes.get(si);
          count += times;
          appearTimes.put(si, times + 1);
        } else {
          appearTimes.put(si, 1);
        }
      }
      
      System.out.println(count);
    }
  }
}