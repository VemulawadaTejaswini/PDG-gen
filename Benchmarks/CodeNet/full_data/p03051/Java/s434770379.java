import java.io.*;
import java.util.*;

public class Main{
  static long beauty(Collection<Integer> l) {
    int ret = 0;
    for (int x : l) {
      ret ^= x;
    }
    return ret;
  }
  
  static long count(List<Integer> l1, List<Integer> l2) {
    if (beauty(l1) != beauty(l2)) {
      return 0;
    }
    return 1;
  }
  
  public static void main(String... args) throws Exception {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String line = stdin.readLine();
    long n = Long.parseLong(line);
    System.err.println(n);
    line = stdin.readLine();
    String[] in = line.split(" ");
    System.err.println(in.length);
    List<Integer> list = new ArrayList<>(in.length);
    for (String s : in) {
      list.add(Integer.parseInt(s));
    }
    System.err.println(beauty(list));

    Set<Integer> setAll = new LinkedHashSet<>(list);
    List<Integer> listSet = new ArrayList<>(setAll);
    
    long res = 1;
    for (int i=0; i<listSet.size(); i++) {
      List<Integer> l1 = listSet.subList(0, i);
      List<Integer> l2 = listSet.subList(i, listSet.size());
      res += count(l1, l2);
    }
    
    System.out.println(res % (10_0000_0000 + 7));
  }
}