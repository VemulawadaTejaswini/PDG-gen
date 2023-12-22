import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayList<Integer> list = new ArrayList<Integer>();
    Arrays.stream(scan.nextLine().split(" ", -1)).forEach(a -> list.add(Integer.parseInt(a)));

    int ans = 0;
    if(list.get(0) >= list.get(1)) {
      ans = 10;
    }
    System.out.println(String.valueOf(ans));
  }
}
  
