import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      Map<Integer, Integer> oddFreq = new HashMap<>();
      Map<Integer, Integer> evenFreq = new HashMap<>();

      for(int i = 0; i < n; i++) {
        if(i % 2 == 0)
          evenFreq.put(arr[i], evenFreq.getOrDefault(arr[i], 0) + 1);
        else
          oddFreq.put(arr[i], oddFreq.getOrDefault(arr[i], 0) + 1);
      }
      List<Map.Entry<Integer, Integer>> oddList = new ArrayList<>(oddFreq.entrySet());
      List<Map.Entry<Integer, Integer>> evenList = new ArrayList<>(evenFreq.entrySet());
      Collections.sort(oddList, (e1, e2) -> e2.getValue() - e1.getValue());
      Collections.sort(evenList, (e1, e2) -> e2.getValue() - e1.getValue());
      if(oddList.get(0).getKey() != evenList.get(0).getKey())
        System.out.println(n - oddList.get(0).getValue() - evenList.get(0).getValue());
      else {
        int oddCnt = oddList.size() == 1 ? 0 : oddList.get(1).getValue();
        int evenCnt = evenList.size() == 1 ? 0 : evenList.get(1).getValue();
        System.out.println(n - Math.max(oddList.get(0).getValue() + evenCnt, evenList.get(0).getValue() + oddCnt));
      }

  }
}