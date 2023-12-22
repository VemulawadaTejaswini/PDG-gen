import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    List<Integer> as = new ArrayList<>();
    
    for(int i = 0; i < N; i++) {
        as.add(sc.nextInt());
    }
    List<Integer> as2 = new ArrayList<>(new HashSet<>(as));
    System.out.println(as2.size());
  }
}
