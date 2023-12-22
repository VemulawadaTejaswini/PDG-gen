import java.util.Map.Entry;
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
 
    int a1=0,a2=0;
    while (!map.isEmpty()) {
      Entry<Integer, Integer> val = map.pollLastEntry();
      if (val.getValue()<2) {
        // do nothing.
      } else if (val.getValue()>3) {
        int key = val.getKey();
        if (a1<key) {
          a1=key;
          a2=key;
        } else if (a2<key) {
          a2=key;
        }
      } else {
        int key = val.getKey();
        if (a1<key) {
          a2=a1;
          a1=key;
        } else if (a2<key) {
          a2=key;
        }
      }
    }
    System.out.println(a1*a2);
  }
}