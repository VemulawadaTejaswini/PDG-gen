import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    // int[] a = new int[n];
    TreeMap<Double,Integer> a = new TreeMap<>();

    for(int i = 0; i < n ; i++){
      double tmp = (double)sc.nextInt();
      Integer value = a.get(tmp);
      if(value == null){
        a.put(tmp, 1);
      } else {
        a.put(tmp, value + 1);
      }
    }

    for(int i = 0; i < m ; i++){
      Map.Entry<Double,Integer> tmp = a.pollLastEntry();
      Double value = tmp.getKey();
      Integer zan = tmp.getValue();
      // System.out.println(value + "," + zan);
      if(zan > 1) {
        a.put(value, zan - 1);
      }
      a.put(value / 2d, 1);
    }

    // System.out.println();
    long ans = 0l;

    Set<Double> keySet = a.keySet();
    for(double key: keySet){
      // System.out.println(key + "," + a.get(key));
      ans += (long)key * (long)a.get(key);
    }

    System.out.println(ans);
  }
}
