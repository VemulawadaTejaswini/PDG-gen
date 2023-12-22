import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();

    int ans = 0;
    ArrayList<String> A = new ArrayList();
    for(int i=1; i<=N; i++) {
      A.add(scan.nextInt()+"_"+i);
    }
    
    Collections.sort(A);
    
    for(String elm : A) {
      System.out.print(elm.split("_")[1] + " ");
    }
  }
}