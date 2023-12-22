import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max=0;
    Map<String,Integer> map = new TreeMap<String,Integer>();
    for (int i=0; i<n; i++){
      String key =sc.next();
      if (map.containsKey(key)) {
        int xx = (int)map.get(key)+1;
        max = chmax(max,xx);
        map.put(key,new Integer(xx));
      } else {
        map.put(key,new Integer(1));
        max = chmax(max,1);
      }
    }
      for (String key :map.keySet()) {
        if (map.get(key)==max) {
        System.out.println(key);
        }
      }
  }
  private static int chmax(int a, int b) {
    return Math.max(a,b);
  }
}


