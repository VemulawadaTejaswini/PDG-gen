import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int T = Integer.parseInt(sc.next());
    
    int min = 10000;
    for(int i = 0; i < N; i++){
      int c = Integer.parseInt(sc.next());
      int t = Integer.parseInt(sc.next());
      if(t <= T && c < min){
        min = c;
      }
    }
    System.out.println(min == 10000 ? "TLE" : min);
  }
}