import java.util.*;

public class Main {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      ArrayList<Integer>  box = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        box.add(sc.nextInt());
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int j = 0; box.size() > j; j++) {
           tmp.add(box.get(box.size() -1 - j));
        }
        box = tmp;
      }
      for (int i = 0; i < box.size(); i ++) {
         System.out.println(box.get(i));
      }
  }
}