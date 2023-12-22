import java.util.Scanner;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;

public class Main{
  static int n, k;
  static int[] a;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    k = sc.nextInt();
    a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }

    int count = 0;
    for(int i = 0; i < n; i++){
      if(a[i] >= k){
        ++count;
      }
    }

    int[] b = new int[n - count];
    int m = 0;
    for(int i = 0; i < n; i++){
      if(a[i] < k){
        b[m++] = a[i];
      }
    }

    TreeSet< Integer > set = new TreeSet< >();
    for(int i = 0; i < m; i++){
      set.add(b[i]);
    }

    Map< Integer, Integer > map = new HashMap< >();
    for(int i = 0; i < m; i++){
      if(map.containsKey(b[i])){
        map.put(b[i], map.get(b[i]) + 1);
      }
      else{
        map.put(b[i], 1);
      }
    }

    int ans = 0;
    for(int i = 0; i < m; i++){
      if(map.get(b[i]) == 1){
        set.remove(b[i]);
      }
      map.put(b[i], map.get(b[i]) - 1);

      if(!check(i, b, set, map)){
        ++ans;
      }

      map.put(b[i], map.get(b[i]) + 1);
      set.add(b[i]);
    }

    System.out.println(ans);
  }

  private static boolean check(int index, int[] b,
    TreeSet< Integer > set, Map< Integer, Integer > map){
    int m = set.size();
    if(set.higher(k - b[index] - 1) != null){
      return true;
    }

    for(int i = 0; i < b.length; i++){
      if(i != index){
        if(map.get(b[i]) == 1){
          set.remove(b[i]);
        }
        Integer lb = set.lower(k - b[i] + 1);
        if(lb != null){
          if(b[i] + lb >= k - b[index] &&
              b[i] + lb < k){
            set.add(b[i]);
            return true;
          }
        }
        set.add(b[i]);
      }
    }

    return false;
  }
}