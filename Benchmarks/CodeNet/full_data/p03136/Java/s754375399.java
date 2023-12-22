import java.util.*;

public class  Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N,sum = 0;
    ArrayList<Integer> L = new ArrayList<Integer>();
    N = s.nextInt();
    for(int i = 0; i < N ;i++){
      L.add(s.nextInt());
      sum += L.get(i);
    }
    Collections.sort(L);
    sum -= L.get(N - 1);
    if(L.get(N - 1) < sum)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}