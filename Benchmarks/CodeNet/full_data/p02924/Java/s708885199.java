import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] p = new int[N];
    for(int i = 1; i < N; i++){
      p[i-1] = i+1;
    }
    p[N-1] = 1;
    
    int s = 0 ;
    for(int i = 1; i <= N; i++){
      s += i%p[i-1];
    }
    System.out.println(s);
  }
}