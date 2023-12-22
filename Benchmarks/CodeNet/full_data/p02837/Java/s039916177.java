import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList[] list1 = new ArrayList[n];
    ArrayList[] list2 = new ArrayList[n];
    for(int i = 0; i < n; i++) {
      ArrayList<Integer> l1 = new ArrayList<Integer>();
      ArrayList<Integer> l2 = new ArrayList<Integer>();
      int a = sc.nextInt();
      for(int j = 0; j < a; j++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        l1.add(x - 1);
        l2.add(y);
      }
      list1[i] = l1;
      list2[i] = l2;
    }
    int ans = 0;
    for(int i = 1; i < (int)Math.pow(2, n); i++) {
      int[] p = new int[n];
      int sum = 0;
      for(int j = 0; j < n; j++) {
        if((i & (1 << j)) != 0) {
          p[j] = 1;
          sum++;
        }
      }
      int t = 0;
      for(int j = 0; j < n; j++) {
        if(p[j] == 1) {
          ArrayList<Integer> l1 = list1[j];
          ArrayList<Integer> l2 = list2[j];
          for(int k = 0; k < l1.size(); k++) {
            if(p[l1.get(k)] != l2.get(k)) t++;
          }
        }
      }
      if(t == 0) ans = Math.max(ans, sum); 
    }
    System.out.println(ans);
  }
}