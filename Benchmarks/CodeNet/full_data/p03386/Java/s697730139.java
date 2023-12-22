import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int A,B,K;
    Set<Integer> set = new HashSet<>();
    A = s.nextInt();
    B = s.nextInt();
    K = s.nextInt();
    for(int i = A; i < A + K && i <= B ; i++){
      set.add(i);
    }

    for(int i = B; i > B - K && i >= A ; i--){
      set.add(i);
    }

    for (Iterator<Integer> itr = set.iterator(); itr.hasNext();) {
      System.out.println(itr.next());
    }

  }
}
