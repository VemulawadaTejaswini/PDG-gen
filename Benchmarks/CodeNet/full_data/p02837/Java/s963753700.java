import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int x, y;
    int[] rep = new int[n];
    Human h;
    List<Human>[] list = new ArrayList[n];
    for(int i = 0; i < n; i++) {
      list[i] = new ArrayList<Human>();
      rep[i] = Integer.parseInt(sc.next());
      for(int j = 0; j < rep[i]; j++) {
        x = Integer.parseInt(sc.next());
        y = Integer.parseInt(sc.next());
        h = new Human(x, y);
        list[i].add(h);
      }
    }
    int ans = 0;
    boolean flag;
    for(int i = 0; i < (1 << n); i++) {
      int[] temp = new int[n];
      flag = true;
      for(int j = 0; j < n; j++) temp[j] = (1 & (i >> j));
      for(int j = 0; j < n; j++) {
        if(temp[j] == 1) {
          Human human;
          for(int k = 0; k < rep[j]; k++) {
            human = list[j].get(k);
            if(temp[human.a] == human.b) continue;
            else flag = false;
          }
        }
      }
      if(flag) {
        int t = 0;
        for(int k = 0; k < n; k++) if(temp[k] == 1) t++;
        ans = Math.max(ans, t);
      }
    }
    System.out.println(ans);
  }

  public static class Human {
    int a;
    int b;

    public Human(int x, int y) {
      this.a = x-1;
      this.b = y;
    }
  }
}
