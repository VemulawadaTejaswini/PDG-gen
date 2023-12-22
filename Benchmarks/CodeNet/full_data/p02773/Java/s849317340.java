import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[] S = new String[N];
    for (int i = 0; i < N; i++) S[i] = sc.next();
    sc.close();

    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++)
      map.compute(S[i], (k, v) -> v == null ? 1 : v + 1);
    Integer max = Collections.max(map.values());
	List<String> list = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : map.entrySet())
      if (max.equals(entry.getValue())) list.add(entry.getKey());
	Collections.sort(list);
    for (String e : list)
      System.out.println(e);
  }
}
