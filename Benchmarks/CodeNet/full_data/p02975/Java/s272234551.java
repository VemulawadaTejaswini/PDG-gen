import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  private final List<Integer> list;
  private final int first;
  public Main(final List<Integer> list) {
    this.list = list.subList(1, list.size());
    this.first = list.get(0);
  }
  public boolean check() {
    List<Integer> list;
    int a, b, tmp;
    for (int i = 0; i < this.list.size(); i++)
      if (this.check(i))
        return true;
    return false;
  }
  private boolean check(final int index) {
    List<Integer> list = this.list;
    int a = this.first;
    int b = list.remove(index);
    int tmp;
    while (!list.isEmpty())
      if (list.contains(a ^ b)) {
        tmp = b;
        b = list.remove(list.indexOf(a ^ b));
        a = tmp;
	  } else
        return false;
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0, end = sc.nextInt(); i < end; i++)
      list.add(sc.nextInt());

    System.out.println(new Main(list).check() ? "Yes" : "No");
  }
}