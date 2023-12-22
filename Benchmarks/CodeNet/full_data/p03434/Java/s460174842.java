import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    List<Integer> as = new ArrayList<>();
    
    for(int i = 0; i < N; i++) {
        as.add(sc.nextInt());
    }

    Collections.sort(as, Collections.reverseOrder());
    
    int res = 0;
    for(int i = 0; i < as.size(); i++) {
        
        if(i == 0 || i % 2 == 0){
            res += as.get(i);
        } else {
            res -= as.get(i);
        }
    }
    
    System.out.println(res);
  }
}
