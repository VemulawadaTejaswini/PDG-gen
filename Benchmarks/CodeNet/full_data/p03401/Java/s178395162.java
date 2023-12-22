import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> list1 = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      list1.add(sc.nextInt());
    }
    for (int i = 0; i < n; i++) {
      List<Integer> list2 = new ArrayList<Integer>(list1);
      list2.remove(i);
      int total = 0;
      for (int j = 0; j < n - 2; j++) {
        total += Math.abs(list2.get(j + 1) - list2.get(j));
      }
        
      System.out.println(total + Math.abs(list2.get(0)) + Math.abs(list2.get(n - 2)));
    }
  }
}