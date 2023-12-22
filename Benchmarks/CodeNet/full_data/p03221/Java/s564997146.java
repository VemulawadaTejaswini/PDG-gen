import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //県
    int m = sc.nextInt(); //市
    int[] p = new int[m]; //市
    int[] y = new int[m]; //誕生年
    for(int i=0; i<m; i++){
      p[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    for(int i=0; i<m; i++){
      int cnt = 1;
      for(int j=0; j<m; j++){
        if(i == j) continue;
        if( p[i] == p[j] && y[i] > y[j] ) cnt++;
      }
      System.out.println(String.format("%06d", p[i]) + String.format("%06d", cnt));
    }
  }
}