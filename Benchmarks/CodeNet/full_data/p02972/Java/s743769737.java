import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Boolean> list = new ArrayList<Boolean>();
    for (int i = 0, end = sc.nextInt(); i < end; i++)
      list.add(sc.nextInt() == 0 ? false : true);

    List<Boolean> box = new ArrayList<Boolean>();
    for (int i = 0; i < list.size(); i++)
      box.add(false);
    for (int i = list.size() - 1; i >= 0; i--) {
      if (list.get(i)) {
	    box.set(i, true);
        for (int j = 0; j < (i+1) / 2; j++)
          if ((i+1) % (j+1) == 0)
		    list.set(j, !list.get(j));
      }
    }
    int count = 0;
    List<Integer> indexs = new ArrayList<Integer>();
    for (int i = 0; i < box.size(); i++)
      if (box.get(i)) {
        count++;
        indexs.add(i+1);
      }
    System.out.println(count);
    System.out.println(indexs.toString().replace(",", "").replace("[", "").replace("]", ""));
  }
}