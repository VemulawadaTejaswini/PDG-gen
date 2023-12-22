import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Integer> a = new HashMap<>();
    int s = Integer.parseInt(sc.next());
    int m = 0;
    
    loop:
    for(int i = 1;; i++) {
      a.put(i, s);
      
      if(s % 2 == 1){
      	s = 3 * s + 1;
      } else {
        s = s / 2;
      }
      
      for(Map.Entry<Integer, Integer> entry : selects.entrySet()) {
        if(entry.getValue() == s) {
        	m = entry.getKey();
          break loop;
        }
      }
    }
    
    System.out.println(m);
  }
}