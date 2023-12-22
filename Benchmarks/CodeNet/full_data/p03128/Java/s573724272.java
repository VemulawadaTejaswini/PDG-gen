import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
    
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<BigInteger> dp = new ArrayList<BigInteger>();
    Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
    int n = sc.nextInt();
    int m = sc.nextInt();
    for(int i=1; i<=m; i++) {
      int a = sc.nextInt();
      switch (a) {
        case 1:
          mp.put(a, 2);
          break;
        case 2:
        case 3:
        case 5:
          mp.put(a, 5);
          break;
        case 4:
          mp.put(a, 4);
          break;
        case 6:
        case 9:
          mp.put(a, 6);
          break;
        case 7:
          mp.put(a, 3);
          break;
        case 8:
          mp.put(a, 7);
          break;

      }
    }
    
    for(int i=0; i<=n+10; i++) {
      dp.add(BigInteger.valueOf(0L));
    }
    
    BigInteger ten = BigInteger.valueOf(10);
    for(int i=0; i<n; i++) {
      if (i != 0 && dp.get(i).equals(BigInteger.valueOf(0L))) continue;
      for(Map.Entry<Integer,Integer> entry : mp.entrySet()) {
        int pos = i + entry.getValue();
        BigInteger tmp = dp.get(pos);
        BigInteger now = dp.get(i).multiply(ten).add(BigInteger.valueOf(entry.getKey()));
        if (now.compareTo(tmp) > 0) {
          dp.set(pos, now);
        }
      }
    }
    System.out.println(dp.get(n));
  }
}
