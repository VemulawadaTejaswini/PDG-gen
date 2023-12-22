import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt(), m = scan.nextInt();

    int[] arr = new int[n];
    for(int i = 0; i < n; i++) arr[i] = 1;
    int nowR = 0;
    boolean[] flag = new boolean[n];
    flag[0] = true;

    for(int loop = 0; loop < m; loop++) {
      int a = scan.nextInt()-1;
      int b = scan.nextInt()-1;

      if(flag[a]) flag[b] = true;

      if(a==nowR) {
        if(arr[a]>1) {
          if(arr[b]>0) {
            flag[b] = true;
          }
        }else {
          flag[a]=false;
        }
      }
      arr[a]--;
      arr[b]++;
      if(arr[a]==0) flag[a] = false;
    }

    int count = 0;
    for(boolean _f : flag) count += (_f)?1:0;
    System.out.println(count);
  }
}
