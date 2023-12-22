import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();

      Map<Integer, Long> freqMap = new HashMap<>();
      for(int i = 0; i < n; i++) {
        int a = sc.nextInt();
        freqMap.put(a, freqMap.getOrDefault(a, 0L) + 1);
      }

      Map<Integer, Long> replaceMap = new HashMap<>();
      for(int i = 0; i < m; i++) {
        int b = sc.nextInt();
        int c = sc.nextInt();
        replaceMap.put(c, replaceMap.getOrDefault(c, 0L) + b);
      }

      List<Integer> list = new ArrayList<>(freqMap.keySet());
      Collections.sort(list);

      List<Integer> list2 = new ArrayList<>(replaceMap.keySet());
      Collections.sort(list2, (a, b) -> b - a);
      for(int i = 0, j = 0; i < list2.size() && j < list.size();) {
        int oldKey = list.get(i);
        long oldCnt = freqMap.get(oldKey);

        int replaceKey = list2.get(i);
        long replaceCnt = replaceMap.get(replaceKey);

        if(oldKey >= replaceKey) break;
        long minCnt = Math.min(oldCnt, replaceCnt);
        oldCnt -= minCnt;
        replaceCnt -= minCnt;
        freqMap.put(oldKey, oldCnt);
        freqMap.put(replaceKey, freqMap.getOrDefault(replaceKey, 0L) + minCnt);
        replaceMap.put(replaceKey, replaceCnt);
        if(oldCnt == 0) j++;
        else i++;
      }
      long sum = 0;
      for(Map.Entry<Integer, Long> entry : freqMap.entrySet())
        sum += entry.getKey() * entry.getValue();
      System.out.println(sum);
  }
}