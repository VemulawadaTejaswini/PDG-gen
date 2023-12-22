import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
          Set<Integer> set1 = new HashSet<>();
          for(int i = 0; i < 3; i++){
            set1.add(sc.nextInt());
          }
          System.out.println(set1.size());
          }
}