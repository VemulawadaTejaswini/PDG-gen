import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    scanner.nextInt();
    String s = scanner.next();
    HashMap<String, MaxStartMinEnd> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j <= s.length(); j++) {
        String sub = s.substring(i, j);
        MaxStartMinEnd msme = map.getOrDefault(sub, new MaxStartMinEnd());
        msme.maxStart = Math.max(msme.maxStart, i);
        msme.minEnd = Math.min(msme.minEnd, j);
        map.put(sub, msme);
      }
    }
    List<Map.Entry<String, MaxStartMinEnd>> list = new ArrayList<>(map.entrySet());
    list.sort((t0, t1) -> t1.getKey().length() - t0.getKey().length());
    for (Map.Entry<String, MaxStartMinEnd> e : list) {
      String sub = e.getKey();
      MaxStartMinEnd msme = e.getValue();
      if (msme.minEnd <= msme.maxStart) {
        System.out.println(sub.length());
        return;
      }
    }
    System.out.println(0);
  }

  private static class MaxStartMinEnd {
    private int maxStart;
    private int minEnd = 5000000;
  }
}
