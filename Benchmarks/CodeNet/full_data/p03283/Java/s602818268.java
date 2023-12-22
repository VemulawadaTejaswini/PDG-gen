import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int m = sc.nextInt();
  int q = sc.nextInt();
  int[][] t = new int[2][m];
  int[][] p = new int[2][q];
  for(int i = 0;i < m;i++){
    t[1][i] = sc.nextInt();
    t[2][i] = sc.nextInt();
  }
  for(int i = 0;i < q;i++){
    p[1][i] = sc.nextInt();
    p[2][i] = sc.nextInt();
  }
Arrays.sort(t, new Comparator<int[]>() { //double[]でコンパレーターを実装する
  public int compare(int[] a, int[] b) {
    if(a[0] > b[0]) {
      return 1;
    }else if (a[0] == b[0]) {
      return 0;
    }else {
      return -1;
  }}});
  for(int i = 0;i < q;i++){
    int count = 0;
    out:
    for(int j = 0;j < m;j++){
      if(p[1][i] <= t[1][j]){
        if(p[2][i] >= t[2][j]){
          count++;
        }
      }
      if(p[1][i] > t[2][j]) {
    	  break out;
      }
      }
    System.out.println(count);
  }
}}
