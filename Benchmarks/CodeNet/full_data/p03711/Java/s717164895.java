import java.util.*;

public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();   
      ArrayList<Integer> lst = new ArrayList<>();
      lst.add(1);
      lst.add(3);
      lst.add(5);
      lst.add(7);
      lst.add(8);
      lst.add(10);
      lst.add(12);
      ArrayList<Integer> lst2 = new ArrayList<>();
      lst2.add(4);
      lst2.add(6);
      lst2.add(9);
      lst2.add(11);
      if ((lst.contains(x) && lst.contains(y)) ||
        (lst2.contains(x) && lst2.contains(y))) {
          System.out.println("YES");
      } else {
        System.out.println("NO");
      }
  }
}   
