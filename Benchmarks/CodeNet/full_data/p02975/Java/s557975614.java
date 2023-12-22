import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  private List<Integer> list;
  public Main(List<Integer> list) {
    this.list = list;
  }
  public boolean check() {
    List<Integer> list;
    int a, b, tmp;
    boolean result = false;
    loop: for (int i = 0; i < this.list.size() - 1; i++) {
      list = this.list;
      a = list.remove(0);
      b = list.remove(i);
      while (!list.isEmpty()) {
        if (list.contains(a ^ b)) {
          tmp = b;
          b = list.remove(list.indexOf(a ^ b));
          a = tmp;
        } else
          continue loop;
      }
      if (list.isEmpty()) {
        result = true;
      	break;
      }
    }
    return result;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0, end = sc.nextInt(); i < end; i++)
      list.add(sc.nextInt());

    boolean result = new Main(list).check();
    System.out.println(result ? "Yes" : "No");
  }
}