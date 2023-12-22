import java.util.*;
public class Main{
  public static void main(String[] args){
    //入力
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    int[] l = new int[q];
    int[] r = new int[q];
    for(int i=0; i<q; i++){
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }

    //右隣がCであるようなAを数える
    int[] at = new int[n];
    int t = 0;
    for(int i=1; i<n; ++i){
      if(s.charAt(i-1) == 'A' & s.charAt(i) == 'C')
        ++t;
      at[i] = t;
    }

    //lからrの間に'AC'があるかどうか調べる
    for(int i=0; i<q; ++i){
      //at[i個目のr] - at[i個目のl]
      System.out.println(at[r[i]-1] - at[l[i]-1]);
    }
  }
}
