import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    int min = Integer.MAX_VALUE;
    int index = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < N; i++) {
      list.add(i + 1 + L - 1);
      if (min > Math.abs(list.get(i))) {
        min = Math.abs(list.get(i));
        index = i;
      }
    }
    System.out.println(list.stream().mapToInt(x -> x).sum() - list.get(index));
  }
}
