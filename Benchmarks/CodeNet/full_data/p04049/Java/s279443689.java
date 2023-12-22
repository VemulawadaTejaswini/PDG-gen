import java.util.*;

class Main{
  static int[][] map;
  static ArrayList<ArrayList<Integer>> list;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt(), k = scan.nextInt();
    list = new ArrayList<>();
    for(int i = 0; i < n; i++) list.add(new ArrayList<Integer>());
    for(int i = 0; i < n-1; i++) {
      int a = scan.nextInt()-1, b = scan.nextInt()-1;
      list.get(a).add(b);
      list.get(b).add(a);
    }
    map = new int[n][n];
    for(int i = 0; i < n; i++) {
      map[i][i] = -1;
      check(i,i,1);
    }

    int tate = 0;
    LABEL2:for(int i = 0; i < n; i++) {
      for(int j = i+1; j < n; j++) {
        if(map[i][j]>k) {
          tate++;
          continue LABEL2;
        }
      }
    }

    int yoko = 0;
    LABEL:for(int i = 0; i < n; i++) {
      for(int j = 0; j < i+1; j++) {
        if(map[j][i]>k) {
          yoko++;
          continue LABEL;
        }
      }
    }

    System.out.println(Math.min(tate,yoko));
  }

  static void check(int x, int y, int l) {
    for(int a : list.get(x)) {
      if(map[y][a]==0) {
        map[y][a] = l;
        check(a,y,l+1);
      }
    }
  }
}
