import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int[][] a = new int[h][w];

    for (int i=0;i<h;++i){
      for (int j=0;j<w;++j){
        a[i][j] =sc.nextInt();
      }
    }

    int n = 0;
    ArrayList<int[]> list = new ArrayList<int[]>();

    for(int i = 0; i < h; i++) {
        if(i % 2 == 0) {
          for(int j = 0; j < w; j++) {
            if((i + j) < h + w - 2) {
              if(a[i][j] % 2 == 1) {
                int[] s = {i, j};
                int[] t = new int[2];
                list.add(s);
                n++;
                if(j < w - 1) {
                  a[i][j + 1]++;
                  t[0] = i;
                  t[1] = j + 1;
                } else {
                  a[i + 1][j]++;
                  t[0] = i + 1;
                  t[1] = j;
                }
                list.add(t);
              }
            }
          } else {
            for(int j = w - 1; j >= 0; j--) {
              if((i + j) < h + w - 2) {
                if(a[i][j] % 2 == 1) {
                  int[] s = {i, j};
                  int[] t = new int[2];
                  list.add(s);
                  n++;
                  if(j > 0) {
                    a[i][j - 1]++;
                    t[0] = i;
                    t[1] = j - 1;
                  } else {
                    a[i + 1][j]++;
                    t[0] = i + 1;
                    t[1] = j;
                  }
                  list.add(t);
                }
              }
            }
          }
        }
      }

    System.out.println(n);

    for(int i = 0; i < list.size() - 1; i++) {
      int[] s = list.get(i);
      int[] t = list.get(i + 1);
      System.out.print(s[0]);
      System.out.print(" ");
      System.out.print(s[1]);
      System.out.print(" ");
      System.out.print(t[0]);
      System.out.print(" ");
      System.out.print(t[1]);
      System.out.println();
    }

  }
}