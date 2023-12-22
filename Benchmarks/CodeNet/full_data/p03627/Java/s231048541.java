import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    TreeMap<Integer,Integer> map = new TreeMap<>();
    for (int i=0; i<n; i++) {
      int a = sc.nextInt();
      map.put(a, map.getOrDefault(a, 0)+1);
    }
    sc.close();

    NavigableSet<Integer> keyset = map.descendingKeySet();
    int a1=0,a2=0;
    for (Integer key: keyset) {
      int val = map.get(key);
      if (val<2) {
        // do nothing.
      } else if (val>3) {
        if (a1==0) {
          a1=key;
          a2=key;
          break;
        } else {
          a2=key;
          break;
        }
      } else {
        if (a1==0) {
          a1=key;
        } else {
          a2=key;
          break;
        }
      }
    }
    System.out.println(a1*a2);
  }
}