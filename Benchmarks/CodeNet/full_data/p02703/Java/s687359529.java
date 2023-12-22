import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int ginka = sc.nextInt(); 
    int move_time = new int[n][n];
    int move_fee = new int[n][n];
    int change_amount = new int[n];
    int change_time = new int[n];
    for(int i = 0; i<m ; i++){
      int src = sc.nextInt()-1;
      int dst = sc.nextInt()-1;
      move_time[src][dst] = sc.nextInt();
      move_time[dst][src] = move_time[src][dst];
      move_fee[src][dst] = sc.nextInt();
      move_fee[dst][src] = move_fee[src][dst];
    }
    for(int t = 1 ; t<n ; t++){
      // どう途中結果を格納すべきかわからん
    }
  }
}