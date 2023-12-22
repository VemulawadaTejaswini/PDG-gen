import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] spot = new int[n];
    for (int i = 0; i < n; i++) {
      spot[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      List<Integer> al = new ArrayList<Integer>();
      int total = 0;
      for (int j = 0; j < n; j++) {
        if (i == j) continue;
        al.add(spot[j]);
        
      
      }
      for (int k = 0; k < n - 2; k++) {
        total += Math.abs(al.get(k + 1) - al.get(k));
      }
      System.out.println(total + Math.abs(al.get(0)) + Math.abs(al.get(n - 2)));
    }
  }
}