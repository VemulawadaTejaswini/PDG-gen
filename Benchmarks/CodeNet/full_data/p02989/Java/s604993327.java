import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> d = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    for (int i = 0; i < size; i++) {
      d.add(sc.nextInt());
    }

    d.sort(Integer::compareTo);

    int half = d.size()/2;
    int count = d.get(half)-d.get(half-1);
    System.out.println(count);

  }
}
