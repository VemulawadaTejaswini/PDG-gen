import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    List<Integer> Hs = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      Hs.add(scan.nextInt());
    }
    scan.close();

    int res = 0;
    int tmp = 0;
    int prev = 0;
      
    for (Integer k : Hs) {
      if (prev >= k) {
        res = Math.max(res, tmp);
      } else {
        tmp++;          
      }

      prev = k;
    }

    System.out.println(res);
  }
}