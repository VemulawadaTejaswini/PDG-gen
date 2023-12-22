import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int[][] mat = new int[h][w];

    for (int i=0; i<h; i++) {
      char[] tmp = sc.next().toCharArray();
      for (int j=0; j<w; j++) {
        if (tmp[j]=='#')
          mat[i][j] = 1;
        else
          mat[i][j] = 0;
      }
    }
    sc.close();

    boolean[][] n_mat = new boolean[h-1][w-1];
    for (int i=0; i<h-1; i++) {
      for (int j=0; j<w-1; j++) {
        if ((mat[i][j]+mat[i+1][j]+mat[i][j+1]+mat[i+1][j+1])%2==0)
          n_mat[i][j]=true;
        else
          n_mat[i][j]=false;
      }
    }

    int[][] hist = new int[h-1][w-1];
    for (int i=0; i<h-1; i++) {
      for (int j=0; j<w-1; j++) {
        if (n_mat[i][j]) {
          if (i==0) {
            hist[i][j]=1;
          } else {
            hist[i][j]=hist[i-1][j]+1;
          }
        } else {
          hist[i][j]=0;
        }
      }
    }

    Stack<int[]> stk = new Stack<>();
    int max=0;
    for (int i=0; i<h-1; i++) {
      for (int j=0; j<w-1; j++) {
        if (n_mat[i][j]) {
          int th = hist[i][j];
          if (stk.isEmpty()) {
            stk.push(new int[]{th,j});
            max=Math.max(max, th+1);
          } else {
            int[] tmp = stk.pop();
            if (tmp[0]<th) {
              stk.push(tmp);
              stk.push(new int[]{th,j});
            } else {
              int tw=tmp[1];
              while (!stk.isEmpty()) {
                tmp=stk.pop();
                if (tmp[0]<th) {
                  stk.push(tmp);
                  break;
                }
                tw=tmp[1];
              }
              stk.push(new int[]{th,tw});
            }

            for (int[] t: stk) {
              max=Math.max(max, (t[0]+1)*(j-t[1]+2));
            }
          }

        } else {
          stk = new Stack<>();
        }
      }
    }

    System.out.println(max);
  }
}