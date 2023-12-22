import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i = a; i < (a + k); i++) {
      set.add(i);
    }
    for(int i = b; i > (b - k); i--) {
      set.add(i);
    }
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(Iterator<Integer> itr = set.iterator(); itr.hasNext();) {
      list.add(itr.next());
    }
    Collections.sort(list);
    for(int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}