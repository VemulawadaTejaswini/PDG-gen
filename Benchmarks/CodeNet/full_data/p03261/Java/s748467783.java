import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      HashSet<String> said = new HashSet<String>();
      int N = in.nextInt();
      String prev = in.next();
      boolean isShiritoriRule = true;

      --N;
      said.add(prev);
      while (N-- > 0){
        String curr = in.next();

        if (said.contains(curr)) {
          isShiritoriRule = false;
        }

        if (prev.charAt(prev.length() - 1) != curr.charAt(0)) {
          isShiritoriRule = false;
        }
        
        said.add(curr);
        prev = curr;
      }

      if (isShiritoriRule) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}