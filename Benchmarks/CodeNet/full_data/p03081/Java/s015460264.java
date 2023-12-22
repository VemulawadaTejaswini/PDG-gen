import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String rawInput = sc.next();
    
    String input = "^" + rawInput + "$";
    char[] map = input.toCharArray();
    char[] ts = new char[q]; 
    char[] ss = new char[q]; 
    for (int i = 0; i < q; i++) {
      String t = sc.next();
      String s = sc.next();
      ts[i] = t.charAt(0);
      ss[i] = s.charAt(0);
    }
    
    int aliveMin = 1;
    int aliveMax = n;
    
    for (int i = q-1; i >= 0; i--) {
//      System.out.printf("i: %d, aliveMin: %d, aliveMax: %d\n", i, aliveMin, aliveMax);
      if (ss[i] == 'L') {
        if (map[aliveMin] == ts[i]) {
          aliveMin++;
        }
        if (map[aliveMax + 1] == ts[i]) {
          aliveMax++;
        }
      } else {
        if (map[aliveMin - 1] == ts[i]) {
          aliveMin--;
        }
        if (map[aliveMax] == ts[i]) {
          aliveMax--;
        }
      }
    }
//      System.out.printf("i: %d, aliveMin: %d, aliveMax: %d\n", 0, aliveMin, aliveMax);
    
    if (aliveMax >= aliveMin) {
      System.out.println(aliveMax - aliveMin + 1);
    } else {
      System.out.println(0);
    }
  }
}
