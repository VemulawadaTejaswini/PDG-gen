import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] a = new int[N-1];
    int[] b = new int[N-1];
    int[] brnch = new int[N];
    int i;
    int K = 0;
    for(i=0;i<N-1;i++){
      a[i] = Integer.parseInt(sc.next());
      b[i] = Integer.parseInt(sc.next());
      brnch[a[i]-1]++;
      brnch[b[i]-1]++;
    }
    for(i=0;i<N;i++){
      if(brnch[i]>K){
        K = brnch[i];
      }
    }
    int[][] color = new int[N][K];
    System.out.println(K);
    int col_i = 0;
    for(i=0;i<N-1;i++){
      col_i = 0;
      while(color[a[i]-1][col_i]!=0 || color[b[i]-1][col_i]!=0)col_i++;
      color[a[i]-1][col_i] = -1;
      color[b[i]-1][col_i] = -1;
      System.out.println(col_i+1);
    }
    System.out.flush();
  }
}
