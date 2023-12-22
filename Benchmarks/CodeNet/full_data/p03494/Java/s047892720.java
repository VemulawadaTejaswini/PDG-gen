import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    List<Integer> As = new ArrayList<>();
    
    int bit = 0;
    for (int i=0; i<N; i++) {
        bit = bit | sc.nextInt();
    }
    
    System.out.println(Integer.numberOfTrailingZeros(bit));
  }
}
